/*
 * Javi Ruiz License
 */


public abstract class Dispositivo {
    private String marca,modelo;
    private double tamaño;
    private boolean estado;

    public Dispositivo(String marca, String modelo, double tamaño) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", tama\u00f1o=" + tamaño + ", estado=" + estado + '}';
    }
    
    
    
}
