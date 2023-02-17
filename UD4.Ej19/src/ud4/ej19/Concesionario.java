/*
 * Javi Ruiz License
 */
package ud4.ej19;

import java.util.*;

public class Concesionario {

    private String nombre, direccion;
    private Set<Vehiculo> concesionario = new HashSet<>();

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public void añadeVehiculo(Vehiculo v) {
        concesionario.add(v);
    }

    public void actualizaVechiculo(Vehiculo v) {
        concesionario.remove(v);
        concesionario.add(v);
    }

    public void borraVehiculo(Vehiculo v) {
        concesionario.remove(v);
    }

    public void muestraVehiculos() {
        Iterator iter = concesionario.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public double calculaPrecioTotal() {
        Iterator<Vehiculo> i = concesionario.iterator();
        double total = 0;
        while (i.hasNext()) {
            total = total + i.next().getPrecio();
        }
        return total;
    }

}
