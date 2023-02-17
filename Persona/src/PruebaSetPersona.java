
import java.util.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class PruebaSetPersona {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("12345678R", "Silvia", "Gonzalez", "34", "Calle Romero", true, true, 635241598);
        Persona p2 = new Persona("12345678R", "Pablo", "Almeida","8", "Calle Alamo", true, true, 968547321);
        Persona p3 = new Persona("32165487J", "Javi", "Ruiz Camacho", "14", "Calle Antoni Ros Marba", true, true, 640015542);
        
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        
        Set personas = new HashSet();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        
        Iterator iter = personas.iterator();
        
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
}
