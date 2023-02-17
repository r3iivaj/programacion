/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class ImpresoraLaser extends Impresoras {

    final void calentarToner() {
        System.out.println("El toner se esta calentado");
    }

    final void magnetizarPapel() {
        System.out.println("El papel se está magnetizando");
    }

    @Override
    public void imprimir(String texto) {
        if (isEncendido()) {
            calentarToner();
            magnetizarPapel();
            System.out.println("Imprimiendo " + texto);
        } else {
            System.out.println("ERROR: La impresora esta apagada");
        }

    }

    @Override
    public void imprimirPaginaPrueba() {
        if (isEncendido()) {
            imprimir("Pagina de prueba de la impresora laser");
        } else {
            System.out.println("ERROR: La impresora esta apagada");
        }

    }
}
