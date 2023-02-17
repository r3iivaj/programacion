/*
 * Javi Ruiz License
 */

public class Funda<T> {

    private T contenido;

    public void guardar(T objeto) {
        contenido = objeto;
    }

    public T sacar(T objeto) {
        T auxliar = contenido;
        contenido = null;
        return auxliar;
    }

    public void estaVacia(){
        if(contenido==null){
            System.out.println("Esta vacia");
        }else{
            System.out.println("No esta vacia");
        }
    }
    
}
