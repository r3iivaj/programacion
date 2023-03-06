
import java.util.*;

/*
 * Javi Ruiz License
 */
public class Factura {

    private List<Producto> productos;
    private String fechaFactura;

    public Factura(String fechaFactura) throws IllegalStateException {
        productos = new ArrayList<>();
        if (fechaFactura.isBlank()) {
            throw new IllegalStateException("La fecha no puede ser nula");
        } else {
            this.fechaFactura = fechaFactura;
        }
    }

    public void agregarProducto(Producto p) throws NullPointerException {
        if (p == null) {
            throw new NullPointerException("El producto no puede ser nulo");
        } else {
            productos.add(p);
            Collections.sort(productos);
        }
    }

    public double calcularImporteTotal() {
        double total = 0;
        for (Producto p : productos) {
            total = p.getPrecio() + total;
        }
        return total;
    }

    public double calcularImporteCategoria(String categoria) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.println("Escriba la categoria de la que quiere calcular el importe");
        categoria = sc.next();
        for (Producto p : productos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                total = p.getPrecio() + total;
            }
        }
        return total;
    }

    public void imprimirFactura() {
        System.out.println("Factura con fecha: " + fechaFactura);
        String cat = "";
        for (Producto p : productos) {
            if (productos.isEmpty()) {
                System.out.println("Factura con fecha: " + fechaFactura);
                System.out.println("No hay productos asociados a la factura");
            } else {
                if (!cat.equalsIgnoreCase(p.getCategoria())) {
                    System.out.println("Categoria: " + p.getCategoria());
                }
                cat = p.getCategoria();
                System.out.println("-" + p.getNombre() + ": " + p.getPrecio() + "€");
            }
        }
        System.out.println("Importe de la factura: " + calcularImporteTotal() + "€");

    }

}
