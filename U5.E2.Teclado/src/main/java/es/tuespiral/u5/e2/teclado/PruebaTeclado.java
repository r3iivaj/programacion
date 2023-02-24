package es.tuespiral.u5.e2.teclado;

public class PruebaTeclado {
    public static void main(String[] args) {
        long entero;
        Teclado t = new Teclado();
        
        System.out.println("ENTERO CUALQUIERA");
        entero = t.leeEntero();
        
        System.out.println("ENTERO EN RANGO 1-10");
        entero = t.leeEntero(1, 10);
        
        System.out.println("ENTERO CON MÁXIMO 100");
        entero = t.leeEnteroMax(100);
        
        System.out.println("ENTERO CON MÍNIMO 10");
        entero = t.leeEnteroMin(10);
        
        System.out.println("ENTERO UN NÚMERO BINARIO");
        entero = t.leerBinario();
        System.out.println("El número leído es: "+entero);
        
        System.out.println("ENTERO UN NÚMERO EN OCTAL");
        entero = t.leerOctal();
        System.out.println("El número leído es: "+entero);
        
        System.out.println("ENTERO UN NÚMERO EN HEXADECIMAL");
        entero = t.leerHex();
        System.out.println("El número leído es: "+entero);
    }
}


