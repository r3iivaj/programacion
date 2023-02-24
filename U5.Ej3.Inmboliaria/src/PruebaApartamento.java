/*
 * Javi Ruiz License
 */

public class PruebaApartamento {

    public static void main(String[] args) {

        try {
            Apartamento a = new Apartamento("", 4, 3, true);

        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            Apartamento a = new Apartamento("JiJi", -2, 3, true);

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            Apartamento a = new Apartamento("JiJi", 2, -9, true);

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            Apartamento a = new Apartamento("JiJi", 2, 3, false);
            a.ocupar();
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
        try {
            Apartamento a = new Apartamento("JiJi", 2, 3, true);
            a.liberar();
        } catch (IllegalStateException e) {
            System.out.println(e);
        }

    }
}
