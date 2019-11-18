/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laFinanciera.dominio;

import java.util.Date;

/**
 *
 * @author juan
 */
public class Cuota {
    private int numCuota;
    private Date fechaPago;
    private Date fechaVencimiento;
    private float importeCuota;

    public Cuota(int numCuota, float importeCuota) {
        this.importeCuota=importeCuota;
        this.numCuota=numCuota;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public float getImporteCuota() {
        return importeCuota;
    }

    public void setImporteCuota(float importeCuota) {
        this.importeCuota = importeCuota;
    }
    
    
}
