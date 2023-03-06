
import java.util.Objects;

/*
 * Javi Ruiz License
 */

public class Camion {

    private String matricula;
    private boolean revisionPasada, depositoCompleto;
    private int kmRecorridos;

    public Camion(String matricula, boolean revisionPasada, boolean depositoCompleto, int kmRecorridos) {
        this.matricula = matricula;
        this.revisionPasada = revisionPasada;
        this.depositoCompleto = depositoCompleto;
        this.kmRecorridos = kmRecorridos;
    }

    public void llenaDeposito() {
        depositoCompleto = true;
    }

    public void realizaRuta() throws DepositoIncompletoException,RevisionPendienteException{
        if (revisionPasada) {
            if (depositoCompleto) {
                kmRecorridos = kmRecorridos + 500;
            }else{
                throw new DepositoIncompletoException("El deposito no está lleno");
            }
        }else{
            throw new RevisionPendienteException("La revision no está pasada");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.matricula);
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
        final Camion other = (Camion) obj;
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Camion{" + "matricula=" + matricula + ", revisionPasada=" + revisionPasada + ", depositoCompleto=" + depositoCompleto + ", kmRecorridos=" + kmRecorridos + '}';
    }
    
    
}
