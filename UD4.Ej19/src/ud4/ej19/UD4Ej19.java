/*
 * Javi Ruiz License
 */
package ud4.ej19;

/**
 *
 * @author usuario
 */
public class UD4Ej19 {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Toyota", "Prius", "8745 BCR", 2006, 16000);
        Vehiculo b = new Vehiculo("Ferrari", "458 Italia", "6958 FRR", 2022, 180000);
        Concesionario c = new Concesionario("Manoli SL.", "C/La Tomilla");

        c.añadeVehiculo(v);
        c.muestraVehiculos();
        System.out.println("-----------------------------");
        c.actualizaVechiculo(v = new Vehiculo("Ferrari", "458 Francia", "8745 BCR", 2022, 180000));
        c.muestraVehiculos();
        System.out.println("------------------------------");
        c.añadeVehiculo(b);
        c.muestraVehiculos();
        System.out.println("-------------------------------");
        System.out.println(c.calculaPrecioTotal());
        c.borraVehiculo(v);
        c.muestraVehiculos();

    }

}
