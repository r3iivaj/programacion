package es.tuespiral.u4.pe.articulos;

import java.util.List;

public class PruebaArticulos {
    public static void main(String[] args) {
        Articulos artic = new Articulos();
        
        artic.agregaArticulo(new Articulo(1, "Ratón", 9.99));
        artic.agregaArticulo(new Articulo(2, "CPU", 189.99));
        artic.agregaArticulo(new Articulo(3, "Monitor", 129.99));
        artic.agregaArticulo(new Articulo(4, "Ratón", 19.99));
        artic.agregaArticulo(new Articulo(5, "Teclado", 9.99));
     
        artic.imprimeArticulos();
        System.out.println("La suma de los precios es: "+artic.calculaTotalArticulos());
        
        System.out.println("-------------");
        Articulo a = new Articulo(5, "Teclado", 9.99);
        
        if (artic.contieneArticulo(a)) {
            System.out.println("El artículo "+a.getCodigo()+" está contenido");
        } else {
            System.out.println("El artículo "+a.getCodigo()+" no está contenido");
        }
        
        if(artic.borraArticulo(a)) {
            System.out.println("El artículo "+a.getCodigo()+" se borró correctamente");
        } else {
            System.out.println("El artículo "+a.getCodigo()+" no se borró");
        }
        
        if (artic.contieneArticulo(a)) {
            System.out.println("El artículo "+a.getCodigo()+" está contenido");
        } else {
            System.out.println("El artículo "+a.getCodigo()+" no está contenido");
        }
        System.out.println("-------------");
        artic.imprimeArticulos();
        
        System.out.println("-------------");
        List<Articulo> lista = artic.toList();
        System.out.println(lista);
        
        System.out.println("-------------");
        lista = artic.obtieneArticuloPorNombre("Ratón");
        System.out.println(lista);
    }
}
