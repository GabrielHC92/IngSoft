/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laFinanciera.presentacion;

import laFinanciera.datos.Repositorio;
import laFinanciera.dominio.Cliente;
import laFinanciera.dominio.Credito;
import laFinanciera.dominio.Plan;
import laFinanciera.servicios.ServicioPublico;
import ws.IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage;
import ws.IServicioPublicoCreditoObtenerEstadoClienteErrorServicioFaultFaultMessage;
import ws.ResultadoEstadoCliente;
import ws.ResultadoOperacion;

/**
 *
 * @author juan
 */
public class SolicitarCreditoPresentador {
    ISolicitarCreditoVista vista;
    Credito credito;
    Cliente cliente;
    String codigoFinanciera = "c3746c76-9ef6-4d4f-8ea2-fe0e573cf71b";
    ResultadoEstadoCliente resConsulta;
    ResultadoOperacion resInforme;

    public SolicitarCreditoPresentador(ISolicitarCreditoVista vista) {
        this.vista = vista;
        this.vista.setPlanes(Repositorio.getPlanes());
        crearCredito();
    }

    private void crearCredito() {
        this.credito = new Credito();
    }

    public void buscarCliente(Integer dni) throws IServicioPublicoCreditoObtenerEstadoClienteErrorServicioFaultFaultMessage {
        cliente=Repositorio.buscarCliente(dni);
        this.consultarEstado(cliente.getDni());
    }

    private void consultarEstado(int dni) throws IServicioPublicoCreditoObtenerEstadoClienteErrorServicioFaultFaultMessage {
        
        resConsulta=ServicioPublico.obtenerEstadoCliente(codigoFinanciera, dni);
        this.vista.setCliente(resConsulta.isTieneDeudas(),resConsulta.getCantidadCreditosActivos(),
                cliente.getNombre(), cliente.getApellido());
    }

    public void agregarCredito(Plan plan, Double montoOtorgado) throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        
        this.credito.setPlan(plan);
        String identificadorCredito = String.valueOf(Repositorio.getProximoNumeroCredito());
        System.out.println("ID CREDITO: "+identificadorCredito);
        this.informarCredito(codigoFinanciera, cliente.getDni(), identificadorCredito, montoOtorgado);
        cliente.agregarCredito(credito);
        
        
    }

    private void informarCredito(String codigoFinanciera, int dni, String identificadorCredito, Double montoOtorgado) throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        resInforme = ServicioPublico.informarCreditoOtorgado(codigoFinanciera, dni, identificadorCredito, montoOtorgado);
        System.out.println("RESULTADO DEL INFORME: " + resInforme.isOperacionValida());
    }

    public void agregarDatosAlCredito(Float monto, Plan plan) {
        credito.setPlan(plan);
        credito.setMontoSolicitado(monto);
        vista.setDetalle(String.valueOf(credito.getMontoSolicitado()),
                         String.valueOf(credito.getPlan().toString()), 
                         String.valueOf(credito.calcularMontoTotal()),
                         String.valueOf(credito.calcularCuotaInt()),
                         String.valueOf(0),
                         String.valueOf(credito.importeAEntregar()));
        
    }

    

    
    
    
    
}
