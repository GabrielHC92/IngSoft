/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laFinanciera.servicios;

import ws.IServicioPublicoCreditoInformarCreditoFinalizadoErrorServicioFaultFaultMessage;
import ws.IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage;
import ws.IServicioPublicoCreditoObtenerEstadoClienteErrorServicioFaultFaultMessage;
import ws.ResultadoEstadoCliente;
import ws.ResultadoOperacion;

/**
 *
 * @author juan
 */
public class ServicioPublico {

    public static ResultadoEstadoCliente obtenerEstadoCliente(java.lang.String codigoFinanciera, java.lang.Integer dni) throws IServicioPublicoCreditoObtenerEstadoClienteErrorServicioFaultFaultMessage {
        ws.ServicioPublicoCredito service = new ws.ServicioPublicoCredito();
        ws.IServicioPublicoCredito port = service.getSGEBusService();
        return port.obtenerEstadoCliente(codigoFinanciera, dni);
    }

    public static ResultadoOperacion informarCreditoOtorgado(java.lang.String codigoFinanciera, java.lang.Integer dni, java.lang.String identificadorCredito, java.lang.Double montoOtorgado) throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        ws.ServicioPublicoCredito service = new ws.ServicioPublicoCredito();
        ws.IServicioPublicoCredito port = service.getSGEBusService();
        return port.informarCreditoOtorgado(codigoFinanciera, dni, identificadorCredito, montoOtorgado);
    }

    private static ResultadoOperacion informarCreditoFinalizado(java.lang.String codigoFinanciera, java.lang.Integer dni, java.lang.String identificadorCredito) throws IServicioPublicoCreditoInformarCreditoFinalizadoErrorServicioFaultFaultMessage {
        ws.ServicioPublicoCredito service = new ws.ServicioPublicoCredito();
        ws.IServicioPublicoCredito port = service.getSGEBusService();
        return port.informarCreditoFinalizado(codigoFinanciera, dni, identificadorCredito);
    }
    
    
}
