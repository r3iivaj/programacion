/*
 * Javi Ruiz License
 */

public class Apartamento {

    private String direccionPostal;
    private int numHabitaciones, numCamasDisponobles;
    private boolean disponible;

    public Apartamento(String direccionPostal, int numHabitaciones, int numCamasDisponobles, boolean disponible) {
        

        if (direccionPostal == null) {
            throw new NullPointerException("La direccion postal debe ser rellenada");
        }

        if (numHabitaciones > 5 || numHabitaciones <= 0) {
            throw new IllegalArgumentException("Selecciona correctamente el numero de habitaciones ");
        }
        if (numCamasDisponobles <= 0 || numCamasDisponobles > 5) {
            throw new IllegalArgumentException("Selecciona correctamente el numero de camas disponibles ");

        }
        this.direccionPostal = direccionPostal;
        this.numHabitaciones = numHabitaciones;
        this.numCamasDisponobles = numCamasDisponobles;
        this.disponible = disponible;
    }

    public void ocupar() {
        if (disponible == false) {
            throw new IllegalStateException("El apartamento ya estaba ocupado");
        }
        disponible = false;
    }

    public void liberar() {
        if (disponible) {
            throw new IllegalStateException("El apartamento ya estaba disponible");
        }
        disponible = true;

    }

}
