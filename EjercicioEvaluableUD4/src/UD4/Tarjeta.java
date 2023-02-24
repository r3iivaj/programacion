/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4;

/**
 *
 * @author Trabajo
 */
public class Tarjeta {
    private int identificador;
    private String nombrePropietario;

    public Tarjeta(int identificador, String nombrePropietario) {
        this.identificador = identificador;
        this.nombrePropietario = nombrePropietario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.identificador;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarjeta other = (Tarjeta) obj;
        return this.identificador == other.identificador;
    }
    
    
}
