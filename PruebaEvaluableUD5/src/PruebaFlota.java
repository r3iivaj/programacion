/*
 * Javi Ruiz License
 */

public class PruebaFlota {

    public static void main(String[] args) throws DepositoIncompletoException, RevisionPendienteException {
        Flota f = new Flota();

        f.altaCamion(new Camion("A", true, true, 0));
        f.altaCamion(new Camion("B", false, true, 0));
        f.altaCamion(new Camion("J", true, true, 0));
        f.altaCamion(new Camion("F", true, false, 0));
        f.altaCamion(new Camion("D", true, true, 0));

        f.imprimeFlota();
        System.out.println("----------------------------------------------------------------------------------------------------");
        f.ponerFlotaEnRuta();
    }
}
