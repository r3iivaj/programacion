/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author usuario
 */
public interface Almacenable {

    int getCodigo();

    double getAltura();

    double getAnchura();

    double getProfundidad();

    double calculaVolumen();

    void almacena(int numEstanteria);

    int localiza();

    void retira();
}
