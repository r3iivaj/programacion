package es.tuespiral.u4.pe.articulos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Articulos {
    private Map<Integer, Articulo> mapa;

    public Articulos() {
        this.mapa = new HashMap<>();
    }
    
    public void agregaArticulo(Articulo a) {
        mapa.put(a.getCodigo(), a);
    }
    
    public boolean contieneArticulo(Articulo a) {
        return mapa.containsKey(a.getCodigo());
    }
    
    public List<Articulo> obtieneArticuloPorNombre(String nombre) {
        List<Articulo> lista = new ArrayList<>();
        
        Collection<Articulo> col = mapa.values();
        Iterator<Articulo> iter = col.iterator();
        
        while(iter.hasNext()) {
            Articulo a = iter.next();
            if (a.getNombre().equals(nombre)) {
                lista.add(new Articulo(a.getCodigo(), a.getNombre(), a.getPrecio()));
            }
        }
        return lista;
    }
    
    public boolean borraArticulo(Articulo a) {
        return mapa.remove(a.getCodigo(), a);
    }
    
    public void imprimeArticulos() {
        if(!mapa.isEmpty()) {
            Collection<Articulo> col = mapa.values();
            Iterator<Articulo> iter = col.iterator();
            while(iter.hasNext()) {
                System.out.println(iter.next());
            }
        } else {
            System.out.println("No hay artículos que mostrar");
        }
    }
    
    public double calculaTotalArticulos() {
        double suma = 0;
        
        Collection<Articulo> col = mapa.values();
        Iterator<Articulo> iter = col.iterator();
        
        while(iter.hasNext()) {
            Articulo a = iter.next();
            suma = suma + a.getPrecio();
        }
        return suma;
    }
    
    public List<Articulo> toList() {
        List<Articulo> lista = new ArrayList<>();
        
        Collection<Articulo> col = mapa.values();
        Iterator<Articulo> iter = col.iterator();
        
        while(iter.hasNext()) {
            Articulo a = iter.next();
            lista.add(new Articulo(a.getCodigo(), a.getNombre(), a.getPrecio()));
        }
        Collections.sort(lista);
        return lista;
    }
}
