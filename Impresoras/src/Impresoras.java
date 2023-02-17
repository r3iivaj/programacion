
/**
 *
 * @author usuario
 */
abstract class Impresoras {

    private boolean encendido;

    protected void encender() {
        encendido = true;
    }

    protected void apagar() {
        encendido = false;
    }

    protected boolean isEncendido() {
        return encendido;
    }
    
    protected void imprimir(String texto){
        
    }
    
    protected void imprimirPaginaPrueba(){
        
    }

}
