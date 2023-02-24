package es.tuespiral.u5.p2.ficherocheckedexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaFicheroThrowsCheckedException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            List<String> texto = new ArrayList<>();
            String input;
            do {
                System.out.println("Dime una frase para insertar en un fichero");
                input = sc.nextLine();
                texto.add(input);
                if (!input.equalsIgnoreCase("*")) {
                    
                }
            } while (input != "*");

            System.out.println("\nDime el nombre del fichero");
            String nombre = sc.next();
            EscrituraFichero f = new EscrituraFichero(nombre);
            f.abrir();
            f.escribeTextoLista(texto);
            f.cerrar();
        } catch (IOException io) {
            System.out.println("Problema al escribir en el archivo");
        }

    }
}
