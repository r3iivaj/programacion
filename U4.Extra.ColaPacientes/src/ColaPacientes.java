
import java.util.ArrayList;
import java.util.List;

public class ColaPacientes {
    private List<Paciente> cola;

    public ColaPacientes() {
        cola = new ArrayList<>();
    }
    
    public void agregaPaciente(Paciente p) {
        cola.add(p);
    }
    
    public boolean isColaVacia() {
        return cola.isEmpty();
    }
    
    public void vacunaSiguientePaciente() {
        if(!cola.isEmpty()) {
            Paciente p = cola.get(0);
            if(p.isVacunado()) {
                System.out.println("¡Hay que estar aburrido para querer vacunarse 2 veces!");
            } else {
                p.vacunar();
                System.out.println("Paciente vacunado correctamente");
            }
            cola.remove(0);
        }
    }
    
    
}
