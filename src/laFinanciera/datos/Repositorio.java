/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laFinanciera.datos;

import laFinanciera.dominio.Cliente;
import laFinanciera.dominio.Plan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import laFinanciera.dominio.Credito;

/**
 *
 * @author juan
 */
public class Repositorio {
    private static ArrayList<Plan> planes = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Credito> creditosOtorgados = new ArrayList<>();
    
    
    
    public static void iniciar(){
        crearPlanes();
        crearClienteTest();
    }

    private static void crearPlanes() {
        planes.add(new Plan("Cuota adelantada", (float) 0.05, 3));
        planes.add(new Plan("Cuota adelantada", (float) 0.6, 12));
        planes.add(new Plan("Cuota adelantada", (float) 0.7, 6));
        planes.add(new Plan("Cuota vencida", (float) 0.7, 6));
    }

    private static void crearClienteTest() {
        clientes.add(new Cliente("Graneros","Juan",20000,33000000));
        clientes.add(new Cliente("Alicata","Alejandro",20000,33000097));
        clientes.add(new Cliente("Calderon","Gabriel",20000,33000200));
        clientes.add(new Cliente("Perez","Gerardo",20000,33000240));
    }

    
    
    public static void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public static Cliente buscarCliente(int dni) {
        Cliente encontrado=null;
        for(Cliente c: clientes){
                if(dni == c.getDni()){
                    encontrado = c;
                    JOptionPane.showMessageDialog(null, "Cliente encontrado");
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                }
        }
        return encontrado;
    }

    public static ArrayList<Plan> getPlanes() {
        return planes;
    }

    public static void setPlanes(ArrayList<Plan> planes) {
        Repositorio.planes = planes;
    }
    
    public static int getProximoNumeroCredito(){
        return creditosOtorgados.size() + 1;
    }
    
}
