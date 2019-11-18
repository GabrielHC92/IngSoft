/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    
}
