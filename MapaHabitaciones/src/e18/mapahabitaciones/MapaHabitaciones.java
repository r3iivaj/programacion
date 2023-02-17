/*
 * Javi Ruiz License
 */

package e18.mapahabitaciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapaHabitaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map estadoHabitaciones = new HashMap();
        int opcion;
        
        estadoHabitaciones.put(101, false);
        estadoHabitaciones.put(102, true);
        estadoHabitaciones.put(103, true);
        estadoHabitaciones.put(104, false);
        estadoHabitaciones.put(105, true);
        estadoHabitaciones.put(201, true);
        estadoHabitaciones.put(202, false);
        estadoHabitaciones.put(203, false);
        estadoHabitaciones.put(204, true);
        estadoHabitaciones.put(205, false);
        
        do {
            System.out.println("0 - Salir");
            System.out.println("1 - Ver estado de ocupación");
            System.out.println("2 - Ocupar una habitación");
            System.out.println("3 - Liberar una habitación");
            System.out.println("Elige una opción:");
            opcion = sc.nextInt();
            
            switch(opcion) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    mostrarEstado(estadoHabitaciones);
                    break;
                case 2:
                    ocupaHabitacion(estadoHabitaciones);
                    break;
                case 3:
                    liberaHabitacion(estadoHabitaciones);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while(opcion != 0);

    }

    private static void ocupaHabitacion(Map estadoHabitaciones) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime qué habitación quieres ocupar: ");
        int numHab = sc.nextInt();
         
        if(estadoHabitaciones.containsKey(numHab)){
            boolean estado = (boolean) estadoHabitaciones.get(numHab);
            
            if(estado) {
                System.out.println("Esa habitación está ya ocupada");
            } else {
                estadoHabitaciones.put(numHab, true);
            }
        
        } else {
            System.out.println("Esa habitación no existe");
        }
        
    }

    private static void liberaHabitacion(Map estadoHabitaciones) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime qué habitación quieres liberar: ");
        int numHab = sc.nextInt();
         
        if(estadoHabitaciones.containsKey(numHab)){
            boolean estado = (boolean) estadoHabitaciones.get(numHab);
            
            if(estado == false) {
                System.out.println("Esa habitación ya está libre");
            } else {
                estadoHabitaciones.put(numHab, false);
            }
        
        } else {
            System.out.println("Esa habitación no existe");
        }
        
    }
    
    private static void mostrarEstado(Map estadoHabitaciones) {
        Set claves = estadoHabitaciones.keySet();
        Iterator iter = claves.iterator();
        while(iter.hasNext()) {
            int numHab = (int) iter.next();
            boolean ocupada = (boolean) estadoHabitaciones.get(numHab);
            
            String estado = "libre";
            if (ocupada)
                estado = "ocupada";
                
            System.out.println("Habitacion "+numHab+": "+estado);
        }
    }
}
