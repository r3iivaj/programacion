
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PruebaAlmacenable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion,codigo = 1;
        double altura, anchura, profundidad;

        do {
            System.out.println("Elige una opcion ");
            System.out.println("0 - SALIR ");
            System.out.println("1 - ALMACENA");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba la altura de su caja");
                    altura = sc.nextDouble();
                    System.out.println("Escriba la anchura de su caja");
                    anchura = sc.nextDouble();
                    System.out.println("Escriba la profundidad de su caja");
                    profundidad = sc.nextDouble();
                    CajaCarton c = new CajaCarton(codigo, altura, anchura, profundidad);
                    codigo = codigo + 1;
                    if(c.calculaVolumen()>=5000){
                        c.almacena(2);
                    }else{
                        c.almacena(1);
                    }
                    break;
                default:
                    System.out.println("Elija una opcion valida");
            }

        } while (opcion != 0);
    }
}
