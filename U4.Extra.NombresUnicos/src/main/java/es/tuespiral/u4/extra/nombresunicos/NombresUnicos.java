package es.tuespiral.u4.extra.nombresunicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NombresUnicos {
    private List<String> lista;
    
    public NombresUnicos() {
       lista = new ArrayList<>();
    }
    
    public void agregaNombre(String nombre) {
       if(!contiene(nombre)) {
           lista.add(nombre);
       } else {
           System.out.println("ERROR: Nombre duplicado");
       }
    }
    
    public void ordenaNombres() {
        Collections.sort(lista);
    }
    
    public void imprimeNombres() {
        int cuenta = 1;
        Iterator<String> iter = lista.iterator();
        while(iter.hasNext()) {
            System.out.println(cuenta +". "+iter.next());
            cuenta++;
        }
    }
    
    public boolean contiene(String nombre) { 
        Iterator<String> iter = lista.iterator();
        while(iter.hasNext()) {
            String elem = iter.next();
            if (elem.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
        
    }
}
