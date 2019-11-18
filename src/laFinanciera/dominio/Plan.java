/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laFinanciera.dominio;

import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class Plan {
    private String modalidad;
    private float porcentajeMensual;
    private float porcentajeGastos;
    private int numCuotas;
    

    public Plan(String modalidad, float porcentaje,float porcGastos, int numCuotas) {
        this.modalidad = modalidad;
        this.porcentajeMensual = porcentaje;
        this.numCuotas = numCuotas;
        this.porcentajeGastos=porcGastos;
    }

    public Plan(String modalidad, float porcentajeMensual, int numCuotas) {
        this.modalidad = modalidad;
        this.porcentajeMensual = porcentajeMensual;
        this.numCuotas = numCuotas;
    }
    
    


    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public float getPorcentaje() {
        return porcentajeMensual;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentajeMensual = porcentaje;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    public float getPorcentajeMensual() {
        return porcentajeMensual;
    }

    public void setPorcentajeMensual(float porcentajeMensual) {
        this.porcentajeMensual = porcentajeMensual;
    }

    public float getPorcentajeGastos() {
        return porcentajeGastos;
    }

    public void setPorcentajeGastos(float porcentajeGastos) {
        this.porcentajeGastos = porcentajeGastos;
    }
    
    
    

    @Override
    public String toString() {
        return "Plan " +  modalidad + ", " + numCuotas + " cuotas, " + porcentajeMensual+"%" ;
    }
    
    
    
}
