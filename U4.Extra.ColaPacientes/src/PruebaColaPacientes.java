public class PruebaColaPacientes {
    public static void main(String[] args) {
        ColaPacientes cola = new ColaPacientes();
        cola.agregaPaciente(new Paciente("Pepe", false));
        cola.agregaPaciente(new Paciente("Rosa", false));
        cola.agregaPaciente(new Paciente("Juan", true));
        cola.agregaPaciente(new Paciente("Ana", false));
        
        while(!cola.isColaVacia()) {
            cola.vacunaSiguientePaciente();
        }
        System.out.println("Todos los pacientes están vacunados");
    }
}   
