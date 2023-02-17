package es.tuespiral.u4.extra.nombresunicos;

public class PruebaNombresUnicos {
    public static void main(String[] args) {
        NombresUnicos nom = new NombresUnicos();
        
        nom.agregaNombre("Pepe");
        nom.agregaNombre("Pepa");
        nom.agregaNombre("Pepito");
        nom.agregaNombre("Pepita");
        nom.agregaNombre("pepe");
        
        nom.imprimeNombres();
        nom.ordenaNombres();
        nom.imprimeNombres();
        
        System.out.println("Contiene Pedro?"+nom.contiene("Pedro"));
        System.out.println("Contiene Pepito?"+nom.contiene("Pepito"));
    }
}
