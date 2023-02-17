/*
 * Javi Ruiz License
 */


public class PruebaFunda {
    public static void main(String[] args) {
        Funda<Smartphone> f1 = new Funda();
        Funda<Tablet> f2 = new Funda();
        
        Smartphone s = new Smartphone("Samsung","Galaxy 8", 6);
        Tablet t  = new Tablet("Huawei", "P10", 10);
        
        f1.guardar(s);
        f2.guardar(t);
        f1.estaVacia();
        f2.estaVacia();
        System.out.println("-----------------------");
        f1.sacar(s);
        f2.sacar(t);
        f1.estaVacia();
        f2.estaVacia();
    }
}
