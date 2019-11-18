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
public class Cliente {
    private String apellido;
    private String nombre;
    private float sueldo;
    private int dni;
    private Domicilio domicilio;
    
    private ArrayList<Credito> creditos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String apellido, String nombre, float sueldo, int dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Credito> getCreditos() {
        return creditos;
    }

    public void setCreditos(ArrayList<Credito> creditos) {
        this.creditos = creditos;
    }
    
    public void agregarCredito(Credito credito){
        this.creditos.add(credito);
    }
    
    
}
