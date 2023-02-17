

/**
 *
 * @author usuario
 */
public class ImpresoraInyeccion extends Impresoras {

    private double capacidadCartucho, capacidadActualCartucho;

    public void cambiarCartucho(double capacidad) {
        if (isEncendido() == false || capacidad <= 0) {
            capacidadCartucho = capacidad;
            capacidadActualCartucho = capacidad;
        } else {
            System.out.println("ERROR: la impresora no esta apagada o el cartucho no tiene capacidad");
        }
    }

    public double getCapacidadCartucho() {
        return capacidadCartucho;
    }

    public double calculaPorcentajeTintaActual() {
        if (isEncendido()) {
            return capacidadActualCartucho / 100;
        } else {
            System.out.println("ERROR: La impresora esta apagada");
        }
        return 0;
    }

    @Override
    public void imprimir(String texto) {
        if (isEncendido()) {
            if (capacidadActualCartucho > 0) {
                System.out.println("Imprimiendo texto");
                System.out.println(texto);
                capacidadActualCartucho = capacidadActualCartucho - (texto.length() * 0.1);
            } else {
                System.out.println("No hay tinta, cambie el cartucho");
            }
            if (capacidadActualCartucho < 0) {
                System.out.println("No se pudo imprimir el documento completo");
                capacidadActualCartucho = 0;
            }
        } else {
            System.out.println("ERROR: La impresora esta apagada");
        }

    }

    @Override
    public void imprimirPaginaPrueba() {
        if (isEncendido()) {
            imprimir("Pagina de prueba de la impresora de inyeccion un cartucho de " + getCapacidadCartucho() + " mililitros de tinta que actualmente esta al" + calculaPorcentajeTintaActual() + " % de su capacidad");
        } else {
            System.out.println("ERROR: La impresora esta apagada");
        }

    }
}
