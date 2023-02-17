
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Recurso {
    
    private final long ISBN;
    private String titulo;
    private List autores;
    private int numEjemplares;
    
    
    public Recurso(long ISBN, String titulo,List autores ,int numEjemplares) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autores = new ArrayList();
        this.numEjemplares = numEjemplares;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(ArrayList autores) {
        this.autores = autores;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }
    
    @Override
    public String toString() {
        return "Recurso{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autores=" + autores + ", numEjemplares=" + numEjemplares + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.ISBN ^ (this.ISBN >>> 32));
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
        final Recurso other = (Recurso) obj;
        return this.ISBN == other.ISBN;
    }
    
    
    
    
}
