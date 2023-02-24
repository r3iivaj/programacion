/*
 * Javi Ruiz License
 */
package es.tuespiral.u5.p2.ficherocheckedexception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class EscrituraFichero {

    private String nombreFichero = "";
    // La clase File representa un fichero y su ruta completa en el sistema
    // de ficheros del sistema operativo.
    private File fichero;
    // La clase FileReader permite crear objetos que saben leer un array de 
    // caracteres de un fichero.
    private FileWriter fr;
    // La clase BufferedReader permite crear un objeto que toma un FileReader
    // como entrada y es capaz de ofrecer operaciones de lectura más cómodas
    // para el programador. Ejemplo: readLine()
    private PrintWriter br;
    private boolean abierto = false;

    public EscrituraFichero(String nombre) {
        if (nombre != null) {
            nombreFichero = nombre;
        }
    }

    public void abrir() throws FileNotFoundException, IOException {
        fichero = new File(nombreFichero);
        fr = new FileWriter(fichero);
        br = new PrintWriter(fr);
        abierto = true;
    }

    public void cerrar() throws IOException {
        if (abierto) {
            br.close();
            fr.close();
            abierto = false;
        } else {
            throw new IllegalStateException("El fichero no está abierto");
        }
    }

    public void escribeTexto(String linea) throws IOException {
        if (abierto) {
            System.out.println(linea);
            br.print(linea);

        } else {
            throw new IllegalStateException("El fichero no está abierto");
        }
    }

    public void escribeTextoLista(List<String> texto) throws IOException {
        if (abierto) {
            System.out.println(texto);
            br.print(texto);

        } else {
            throw new IllegalStateException("El fichero no está abierto");
        }
    }

}
