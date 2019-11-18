/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laFinanciera.dominio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juan
 */
public class Credito {
    private Date fechaCredito;
    private Date fechaVencimiento;
    private Plan plan;
    EstadoCredito estado;
    private int numCredito;
    private ArrayList<Cuota> cuotas = new ArrayList<>();
    private float montoSolicitado;
    

    public Credito() {
    }

    public Credito(Date fechaCredito, Date fechaVencimiento, EstadoCredito estado) {
        this.fechaCredito = fechaCredito;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
       
    }

    public Date getFechaCredito() {
        return fechaCredito;
    }

    public void setFechaCredito(Date fechaCredito) {
        this.fechaCredito = fechaCredito;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public EstadoCredito getEstado() {
        return estado;
    }

    public void setEstado(EstadoCredito estado) {
        this.estado = estado;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public float getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(float montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

   
    public void confirmarCredito(int numero){
        fechaCredito = new Date();
        this.numCredito=numero;
        estado=EstadoCredito.Pendiente;
        
    }
    
    public void agregarCuotas(float importeCuota){
        for(int i=0;i<plan.getNumCuotas();i++){
            cuotas.add(new Cuota(i,importeCuota));
        }
    }
    
    public float calcularInteres(){
        return this.montoSolicitado*plan.getPorcentajeMensual();
    }
    
    public float calcularCuotaPura(){
        return this.montoSolicitado/this.plan.getNumCuotas();
    }
    
    public float calcularCuotaInt(){
        return this.calcularCuotaPura()+this.calcularInteres();
    }
    
    public float calcularMontoTotal(){
        return this.calcularCuotaInt()*plan.getNumCuotas();
    }
    
    public float importeAEntregar(){
        return this.montoSolicitado-this.calcularCuotaInt();
    }
    
}
