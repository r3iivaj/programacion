/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4;

/**
 *
 * @author Trabajo
 */
public class PruebaPuertaurbanizacion {

    public static void main(String[] args) {
        PuertaUrbanizacion p = new PuertaUrbanizacion();
        Tarjeta t = new Tarjeta(1, "Javi");
        Tarjeta t1 = new Tarjeta(8, "Sandra");

        p.agregaTarjetaPermitida(t);
        p.intentodeEntrada(t.getIdentificador());
        p.agregaTarjetaPermitida(t1);
        p.imprimeTarjetasPermitidas();

        p.intentodeEntrada(t1.getIdentificador());
    }
}
