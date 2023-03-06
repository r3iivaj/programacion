
import java.util.Objects;

/*
 * Javi Ruiz License
 */
public class Producto implements Comparable {

    private String categoria, nombre;
    private double precio;

    public Producto(String categoria, String nombre, double precio) throws NullPointerException,IllegalArgumentException {
        if (categoria.equals(null) || nombre.equals(null)) {
            throw new NullPointerException("El nombre o la categoria son nulos.");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException(" El precio no puede ser menor o igual a cero");
        }
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.categoria);
        hash = 37 * hash + Objects.hashCode(this.nombre);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Object o) {
        Producto p = (Producto) o;
        int respuesta = this.categoria.compareTo(p.getCategoria());
        if (respuesta == 0) {
            respuesta = -Double.compare(precio, p.getPrecio());
        }
        return respuesta;
    }
}
