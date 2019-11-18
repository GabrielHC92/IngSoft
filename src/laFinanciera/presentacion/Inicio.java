/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laFinanciera.presentacion;

import laFinanciera.datos.Repositorio;
import laFinanciera.vistas.SolicitarCreditoVista;

/**
 *
 * @author juan
 */
public class Inicio {
    public static void main(String[] args) {
        Repositorio.iniciar();
        (new SolicitarCreditoVista()).setVisible(true);
    }
}
