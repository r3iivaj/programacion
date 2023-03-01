
import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws SQLException {
        int opcion;
        Teclado t = new Teclado();

        do {
            imprimeMenu();
            opcion = t.leeEntero();

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    listarEmpleadosOrdenadosPorCodigo();
                    break;
                case 2:
                    listarEmpleadosOrdenadosPorCategoria();
                    break;
                case 3:
                    buscarEmpleadoPorCodigo();
                    break;
                case 4:
                    buscarEmpleadosPorCategoria();
                    break;
                case 5:
                    buscarEmpleadosPorNombreApellidos();
                    break;
                case 6:
                    buscarEmpleadosConSalarioMinimo();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 0);
    }

    private static void imprimeMenu() {
        System.out.println("\n\n0 - Salir");
        System.out.println("1 - Listar empleados ordenados por código");
        System.out.println("2 - Listar empleados ordenados por categoría");
        System.out.println("3 - Buscar empleado por código");
        System.out.println("4 - Buscar empleados por categoría");
        System.out.println("5 - Buscar empleados por nombre y apellidos");
        System.out.println("6 - Buscar empleados con un salario mínimo");

        System.out.print("Escoge una opción: ");
    }

    private static void listarEmpleadosOrdenadosPorCodigo() throws SQLException {
        BDEmpleado bd = new BDEmpleado();
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;

        do {
            try {
                bd.connect();
                for (Empleado e : bd.selectAll()) {
                    System.out.println(e);
                }
                repetir = false;
            } catch (SQLException e) {
                System.out.println("Error: la BD esta sobrecargada");
                System.out.println("Quieres reintentar el proceso? ");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("S")) {
                    repetir = true;
                }
            } finally {
                bd.disconnect();
            }
        } while (repetir);
    }

    private static void listarEmpleadosOrdenadosPorCategoria() throws SQLException {
        BDEmpleado bd = new BDEmpleado();
        boolean repetir = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                bd.connect();
                for (Empleado e : bd.selectAllOrderByCategoria()) {
                    System.out.println(e);
                }
                repetir = false;
            } catch (SQLException e) {
                System.out.println("Error: la BD esta sobrecargada");
                System.out.println("Quieres reintentar el proceso? ");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("S")) {
                    repetir = true;
                }
            } finally {
                bd.disconnect();
            }
        } while (repetir);
    }

    private static void buscarEmpleadoPorCodigo() throws SQLException {
        BDEmpleado bd = new BDEmpleado();
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;

        do {
            try {
                bd.connect();
                System.out.println("Escribe el ceodigo del empleado a buscar ");
                bd.selectByCodigo(sc.nextInt());
                repetir = false;
            } catch (SQLException e) {
                System.out.println("Error: la BD esta sobrecargada");
                System.out.println("Quieres reintentar el proceso? ");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("S")) {
                    repetir = true;
                }
            } finally {
                bd.disconnect();
            }
        } while (repetir);
    }

    private static void buscarEmpleadosPorCategoria() throws SQLException {
        BDEmpleado bd = new BDEmpleado();
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;
        do {
            try {
                bd.connect();
                System.out.println("Escribe la categoria");
                bd.selectByCategoria(sc.nextLine());
            } catch (SQLException e) {
                System.out.println("Error: la BD esta sobrecargada");
                System.out.println("Quieres reintentar el proceso? ");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("S")) {
                    repetir = true;
                }
            } finally {
                bd.disconnect();
            }
        } while (repetir);
    }

    private static void buscarEmpleadosPorNombreApellidos() {
        BDEmpleado bd = new BDEmpleado();
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;
        do {
            try {
                bd.connect();
                System.out.println("Escribe el nombre de la persona a buscar");
                String nombre = sc.nextLine();
                System.out.println("Escribe los apellidos de la persona a buscar");
                String apellidos = sc.nextLine();
                System.out.println(bd.selectByNombreApellidos(nombre, apellidos));
            } catch (SQLException e) {
                System.out.println("Error: la BD esta sobrecargada");
                System.out.println("Quieres reintentar el proceso? ");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("S")) {
                    repetir = true;
                }
            } finally {
                bd.disconnect();
            }
        } while (repetir);
    }

    private static void buscarEmpleadosConSalarioMinimo() {
        BDEmpleado bd = new BDEmpleado();
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;
        do {
            try {
                bd.connect();
                System.out.println("Escribe el salario minimo de las personas a buscar");
                bd.selectByMinSalarioOrdered(sc.nextDouble());
            } catch (SQLException e) {
                System.out.println("Error: la BD esta sobrecargada");
                System.out.println("Quieres reintentar el proceso? ");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("S")) {
                    repetir = true;
                }
            } finally {
                bd.disconnect();
            }
        } while (repetir);
    }
}
