/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class CajaCarton implements Almacenable {

    private int codigo,numEstanteria;
    private double altura, anchura, profundidad, volumen;

    public CajaCarton(int codigo, double altura, double anchura, double profundidad) {
        this.codigo = codigo;
        this.altura = altura;
        this.anchura = anchura;
        this.profundidad = profundidad;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public double getAltura() {
        return altura;
    }

    @Override
    public double getAnchura() {
        return anchura;
    }

    @Override
    public double getProfundidad() {
        return profundidad;
    }

    @Override
    public double calculaVolumen() {
        volumen = getAltura() * getAnchura() * getProfundidad();
        return volumen;
    }

    @Override
    public void almacena(int numEstanteria) {
        if (numEstanteria > 0) {
            this.numEstanteria = numEstanteria;
            System.out.println("Se ha almacenado la caja con codigo: " + getCodigo() + " en la estanteria " + numEstanteria );
        }else{
            System.out.println("Elige una estanteria entre el 1 y el 100");
        }
    }

    @Override
    public int localiza() {
        return numEstanteria;
    }

    @Override
    public void retira() {
        numEstanteria = 0;
    }

}
