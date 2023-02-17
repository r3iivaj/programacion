
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Persona {
    
    final String dni;
    private String nombre, apelllidos,edad,direccion;
    private boolean casada,trabajo;
    private int tel;

    public Persona(String dni, String nombre, String apelllidos, String edad, String direccion, boolean casada, boolean trabajo, int tel) {
        this.dni = dni;
        this.nombre = nombre;
        this.apelllidos = apelllidos;
        this.edad = edad;
        this.direccion = direccion;
        this.casada = casada;
        this.trabajo = trabajo;
        this.tel = tel;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelllidos() {
        return apelllidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isCasada() {
        return casada;
    }

    public boolean isTrabajo() {
        return trabajo;
    }

    public int getTel() {
        return tel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelllidos(String apelllidos) {
        this.apelllidos = apelllidos;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCasada(boolean casada) {
        this.casada = casada;
    }

    public void setTrabajo(boolean trabajo) {
        this.trabajo = trabajo;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apelllidos=" + apelllidos + ", edad=" + edad + ", direccion=" + direccion + ", casada=" + casada + ", trabajo=" + trabajo + ", tel=" + tel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dni);
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }

    
}
