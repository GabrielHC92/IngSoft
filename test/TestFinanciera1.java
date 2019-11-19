/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import laFinanciera.dominio.Credito;
import laFinanciera.dominio.Plan;
import laFinanciera.presentacion.ISolicitarCreditoVista;
import laFinanciera.presentacion.SolicitarCreditoPresentador;
import laFinanciera.vistas.SolicitarCreditoVista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ws.IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage;

/**
 *
 * @author gabri
 */
public class TestFinanciera1 {
    
    public TestFinanciera1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        //Setea el plan para usarlo en varias pruebas
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void calcularParametrosDelCreditoConPlanCuotaAdelantadaConTresCuotasCincoPorCientoInteresMontoDe10000() throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        //Configuracion
        float montoSolicitado=10000;
        ISolicitarCreditoVista vista = new SolicitarCreditoVista();
        SolicitarCreditoPresentador presentador = new SolicitarCreditoPresentador(vista);
        Plan plan = new Plan("Cuota adelantada", (float) 0.05, 3);
        //Ejecucion
        //presentador.agregarDatosAlCredito(montoSolicitado, plan);
        float creditoMontoSolicitado=presentador.getCredito().getMontoSolicitado();
        float 
        //Validacion
        assertEquals(10000.0,creditoMontoSolicitado,0.01); 
        assertEquals(11500.0, presentador.getCredito().calcularMontoTotal(),0.01);
        assertEquals(3833.3333, presentador.getCredito().calcularCuotaInt(),0.0001);
        assertEquals(6166.667, presentador.getCredito().importeAEntregar(),0.001);
    }
    
    public void calcularParametrosDelCreditoConPlanCuotaAdelantadaConDoceCuotasSeisPorCientoInteresMontoDe10000() throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        //Configuracion
        float montoSolicitado=10000;
        ISolicitarCreditoVista vista = new SolicitarCreditoVista();
        SolicitarCreditoPresentador presentador = new SolicitarCreditoPresentador(vista);
        Plan plan = new Plan("Cuota adelantada", (float) 0.06, 12);
        
        assertEquals(10000.0, presentador.getCredito().getMontoSolicitado(),0.01); 
        assertEquals(17200.0, presentador.getCredito().calcularMontoTotal(),0.01);
        assertEquals(1433.3333, presentador.getCredito().calcularCuotaInt(),0.0001);
        assertEquals(8566.667, presentador.getCredito().importeAEntregar(),0.001);
    }
    /*
    @Test
    public void ObtenerMontoaEntregarParaPlanCuotaAdelantadaconClienteJubilado(){
        //Secciones
        //Configuración: Declaración de objetos y datos
        
        
        //Crea un cliente y un crédito
        //Ejecución: Llamada de los métodos
        //Ejecuta el Crédito con Plan y Monto y obtengo el total a entregar
        //Validación: Comparación entre resultado de ejecución y resultados esperados
                //Método Assert
                //usar assert.equal y le paso el monto y un delta para el tema del redondeo por ej. 
                //una dif de 0.1 donde se toma como válido
    }
    */
}
