package es.tuespiral.u5.e2.teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
    private Scanner sc;
    
    public Teclado() {
        sc = new Scanner(System.in);
    }
    
    public int leeEntero() {
        int entero;
        while(true) {
            try {
                System.out.println("Introduce un número entero: ");
                entero = sc.nextInt();
                sc.nextLine();
                return entero;
            } catch(InputMismatchException e) {
                System.out.println("El número introducido no tiene el formato correcto");
                sc.nextLine();
            }
        }
    }
    
    public int leeEntero(int minimo, int maximo) {
        int entero;
        while(true) {
            entero = leeEntero();
            if (entero < minimo || entero > maximo) {
                System.out.println("El número debe estar entre "+minimo+" y "+maximo);
            } else {
                return entero;
            }
        }
    }
    
    public int leeEnteroMax(int maximo) {
        int entero;
        while(true) {
            entero = leeEntero();
            if (entero > maximo) {
                System.out.println("El número debe ser menor o igual que "+maximo);
            } else {
                return entero;
            }
        }
    }
    
    public int leeEnteroMin(int minimo) {
        int entero;
        while(true) {
            entero = leeEntero();
            if (entero < minimo) {
                System.out.println("El número debe ser mayor o igual que "+minimo);
            } else {
                return entero;
            }
        }
    }
    
    public int leerBinario() {
        int entero;
        String linea;
        while(true) {
            try {
                System.out.println("Introduce un número binario: ");
                linea = sc.nextLine();
                entero = Integer.parseInt(linea, 2);
                return entero;
            } catch(NumberFormatException e) {
                System.out.println("El número introducido no tiene el formato correcto");
            } 
        }
    }
    
    public int leerOctal() {
        int entero;
        String linea;
        while(true) {
            try {
                System.out.println("Introduce un número octal: ");
                linea = sc.nextLine();
                entero = Integer.parseInt(linea, 8);
                return entero;
            } catch(NumberFormatException e) {
                System.out.println("El número introducido no tiene el formato correcto");
            } 
        }
    }
    
    public long leerHex() {
        long entero;
        String linea;
        while(true) {
            try {
                System.out.println("Introduce un número hexadecimal: ");
                linea = sc.nextLine();
                entero = Long.parseLong(linea, 16);
                return entero;
            } catch(NumberFormatException e) {
                System.out.println("El número introducido no tiene el formato correcto");
            } 
        }
    }
}
