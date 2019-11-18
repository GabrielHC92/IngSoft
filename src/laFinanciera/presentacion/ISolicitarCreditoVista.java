/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laFinanciera.presentacion;

import java.util.ArrayList;
import laFinanciera.dominio.Plan;

/**
 *
 * @author juan
 */
public interface ISolicitarCreditoVista {
    void setPlanes(ArrayList<Plan> planes);
    void setCliente(boolean deudas, int creditosActivos, String nombre, String apellido);
    void setDetalle(String monto, String plan, String total, String importeCuota, String importeGastos, String importeEntregado);
}
