/*
 * Javi Ruiz License
 */
import java.util.*;

public class Flota {

    private Set<Camion> flota;

    public Flota() {
        this.flota = new HashSet<>();
    }

    public void altaCamion(Camion c) {
        if (flota.contains(c)) {
            System.out.println("El camion ya esta en la flota");
        } else {
            flota.add(c);
        }
    }

    public boolean bajaCamion(Camion c) {
        if (flota.remove(c)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contieneCamion(Camion c) {
        if (flota.contains(c)) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimeFlota() {
        Iterator<Camion> iter = flota.iterator();
        int cont = 1;
        while (iter.hasNext()) {
            System.out.println(cont + " - " + iter.next().toString());
            cont++;
        }
    }

    public void ponerFlotaEnRuta() throws DepositoIncompletoException, RevisionPendienteException {
        for (Camion c : flota) {
            try {
                c.realizaRuta();
                System.out.println("En Ruta: " + c.toString());
            }catch(DepositoIncompletoException | RevisionPendienteException e){
                System.out.println(e.getMessage() + ": " + c.toString());
            }
        }
    }

}
