
import java.util.*;

/*
 * Javi Ruiz License
 */
public class PruebaMapaCliente {

    public static void main(String[] args) {
        Map clientes = new HashMap();

        Cliente c1 = new Cliente(1, "Javi", "Ruiz");
        Cliente c2 = new Cliente(2, "Miguel Angel", "Ruiz");
        Cliente c3 = new Cliente(3, "Sergio", "Terrino");

        clientes.put(c1.getIdCliente(), c1);
        clientes.put(c3.getIdCliente(), c3);
        clientes.put(c2.getIdCliente(), c2);


        Iterator iter = clientes.keySet().iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        clientes.remove(c1.getIdCliente());

        c2 = (Cliente) clientes.get(c2.getIdCliente());
        c2.setNombre("Rodrigo");
        clientes.put(2, c2);
        
        iter = clientes.keySet().iterator();
        System.out.println("----------------------------");
        
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
