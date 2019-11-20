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
        float montoTotal = presentador.getCredito().calcularMontoTotal();
		float cuotaConInteres = presentador.getCredito().calcularCuotaInt(); 
		float importeAEntregar = presentador.getCredito().importeAEntregar();
        //Validacion
        assertEquals(10000.0,creditoMontoSolicitado,0.01); 
        assertEquals(11500.0, montoTotal,0.01);
        assertEquals(3833.3333, cuotaConInteres,0.0001);
        assertEquals(6166.667,importeAEntregar ,0.001);
    }
    @Test
    public void calcularParametrosDelCreditoConPlanCuotaAdelantadaConDoceCuotasSeisPorCientoInteresMontoDe10000() throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        //Configuracion
        float montoSolicitado=10000;
        ISolicitarCreditoVista vista = new SolicitarCreditoVista();
        SolicitarCreditoPresentador presentador = new SolicitarCreditoPresentador(vista);
        Plan plan = new Plan("Cuota adelantada", (float) 0.06, 12);
		//Ejecucion
		float creditoMontoSolicitado=presentador.getCredito().getMontoSolicitado();
        float montoTotal = presentador.getCredito().calcularMontoTotal();
		float cuotaConInteres = presentador.getCredito().calcularCuotaInt(); 
		float importeAEntregar = presentador.getCredito().importeAEntregar();
        //Validacion
        assertEquals(10000.0, creditoMontoSolicitado,0.01); 
        assertEquals(17200.0, montoTotal,0.01);
        assertEquals(1433.3333, presentador.getCredito().calcularCuotaInt(),0.0001);
        assertEquals(8566.667, presentador.getCredito().importeAEntregar(),0.001);
    }

	@Test
    public void calcularParametrosDelCreditoConPlanCuotaAdelantadaConTresCuotasCincoPorCientoInteresMontoDe20000() throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        //Configuracion
        float montoSolicitado=20000;
        ISolicitarCreditoVista vista = new SolicitarCreditoVista();
        SolicitarCreditoPresentador presentador = new SolicitarCreditoPresentador(vista);
        Plan plan = new Plan("Cuota adelantada", (float) 0.05, 3);
		//Ejecucion
		float creditoMontoSolicitado=presentador.getCredito().getMontoSolicitado();
        float montoTotal = presentador.getCredito().calcularMontoTotal();
		float cuotaConInteres = presentador.getCredito().calcularCuotaInt(); 
		float importeAEntregar = presentador.getCredito().importeAEntregar();
        //Validacion
        assertEquals(20000, creditoMontoSolicitado,0.01); 
        assertEquals(23000, montoTotal,0.01);
        assertEquals(7666.6666, cuotaConInteres,0.0001);
        assertEquals(12333.334, importeAEntregar,0.001);
    }

	@Test
    public void calcularParametrosDelCreditoConPlanCuotaAdelantadaConSeisCuotasSietePorCientoInteresMontoDe55000() throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        //Configuracion
        float montoSolicitado=55000;
        ISolicitarCreditoVista vista = new SolicitarCreditoVista();
        SolicitarCreditoPresentador presentador = new SolicitarCreditoPresentador(vista);
        Plan plan = new Plan("Cuota adelantada", (float) 0.06, 3);
        //Ejecucion
		float creditoMontoSolicitado=presentador.getCredito().getMontoSolicitado();
        float montoTotal = presentador.getCredito().calcularMontoTotal();
		float cuotaConInteres = presentador.getCredito().calcularCuotaInt(); 
		float importeAEntregar = presentador.getCredito().importeAEntregar();
		//Validacion
        assertEquals(55000, creditoMontoSolicitado,0.01); 
        assertEquals(78100, montoTotal,0.01);
        assertEquals(13016.6666, cuotaConInteres ,0.0001);
        assertEquals(41983.333, importeAEntregar,0.001);
    }

	@Test
    public void calcularParametrosDelCreditoConPlanCuotaAdelantadaConVeintiCuatroCuotasNuevePorCientoInteresMontoDe35578() throws IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage {
        //Configuracion
        float montoSolicitado=35578;
        ISolicitarCreditoVista vista = new SolicitarCreditoVista();
        SolicitarCreditoPresentador presentador = new SolicitarCreditoPresentador(vista);
        Plan plan = new Plan("Cuota adelantada", (float) 0.09, 24);
		//Ejecucion
		float creditoMontoSolicitado=presentador.getCredito().getMontoSolicitado();
        float montoTotal = presentador.getCredito().calcularMontoTotal();
		float cuotaConInteres = presentador.getCredito().calcularCuotaInt(); 
		float importeAEntregar = presentador.getCredito().importeAEntregar();
       	//Validacion
        assertEquals(35578, creditoMontoSolicitado,0.01); 
        assertEquals(112426.48, montoTotal,0.01);
        assertEquals(4684.43666, cuotaConInteres,0.0001);
        assertEquals(30893.5334, importeAEntregar,0.001);
    }
 
}
