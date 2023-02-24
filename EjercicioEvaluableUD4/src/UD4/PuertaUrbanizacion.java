/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4;

import java.util.*;

/**
 *
 * @author Trabajo
 */
public class PuertaUrbanizacion {

    private Map<Integer, Tarjeta> tarjetasPermitidas;
    private Set<Tarjeta> tarjetasDentro;

    public PuertaUrbanizacion() {
        tarjetasPermitidas = new HashMap<>();
        tarjetasDentro = new HashSet<>();

    }

    public void agregaTarjetaPermitida(Tarjeta t) {
        if (tarjetasPermitidas.containsKey(t.getIdentificador())) {
            System.out.println("Error: la tarjeta ya esta agregada");
        } else {
            tarjetasPermitidas.put(t.getIdentificador(), t);
            System.out.println("Tarjeta añadida correctamente");
        }
    }

    public void eliminaTarjetaPermitida(int identificador) {
        if (tarjetasPermitidas.containsKey(identificador)) {
            tarjetasPermitidas.remove(identificador);
            System.out.println("Operacion realizada correctamente");
        } else {
            System.out.println("La tarjeta que busca no existe en nuestro diccionario");
        }
    }

    public void imprimeTarjetasPermitidas() {
        Iterator iter = tarjetasPermitidas.keySet().iterator();

        if (tarjetasPermitidas.isEmpty()) {
            System.out.println("El diccionario de tajetas esta vacio");
        } else {
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }
    }

    public void intentodeEntrada(int<Tarjeta> identificador) {
        if (tarjetasPermitidas.containsKey(identificador)) {
            if (!tarjetasDentro.contains(identificador)) {
                tarjetasDentro.add(identificador);
                System.out.println("Su vehiculo puede entrar a la urbanizacion");
            } else {
                System.out.println("Error: su tarjeta ya fue introducida y su vehiculo aun no ha salido");
                return;
            }
        } else {
            System.out.println("Error: el identificador introducido no tiene tarjeta correspondiente");
        }
    }

    public void intentodeSalida(int

    
        <Tarjeta> identificador) {
        if (tarjetasDentro.contains(identificador)) {
            tarjetasDentro.remove(identificador);
            System.out.println("Su vehiculo puede salir de la urbanizacion");
        } else {
            System.out.println("Error: su tarjeta no fue introducida");
        }
    }

}
