/*
 * Javi Ruiz License
 */

public class PruebaFacturas {

    public static void main(String[] args) {
//        try{
//            Producto p = new Producto("Colonia", "Au the perfum", -30);
//        }catch(IllegalArgumentException iae){
//            System.out.println(iae);
//        }

//        try {
//            Factura f = new Factura("");
//        } catch (IllegalStateException npe) {
//            System.out.println(npe);
//        }

        Factura f = new Factura("12/03/2022");
        f.agregarProducto(new Producto("Hogar", "Lavavajillas", 350.0));
        f.agregarProducto(new Producto("Hogar", "Frigorifico", 400.0));
        f.agregarProducto(new Producto("Hogar", "Lavadora", 300.0));
        f.agregarProducto(new Producto("Tecnologia", "Impresora", 120.0));
        f.agregarProducto(new Producto("Tecnologia", "Router", 50.0));
        f.imprimirFactura();
        
        System.out.println(f.calcularImporteCategoria("Hogar")+ "€");

    }
}
