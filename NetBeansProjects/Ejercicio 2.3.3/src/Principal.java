
/**
 *
 * @author arielmathias
 */
public class Principal {
    public static void main(String[] args) {
        
        Abarrotes aceite = new Abarrotes("Lider", 1, "1 litro", 3500, 2);
        Abarrotes arroz = new Abarrotes("Acuenta", 2, "1 kilo", 3000, 3);
        
        Liquidos bebida = new Liquidos("Cocacola", 3, "3 litros", 2500, 2);
        Liquidos jugo = new Liquidos("Watts", 4, "2 litros", 2000, 1);
        
        Congelados choclo = new Congelados("Chocloton", 5, "1 kilo", 1500, 4);
        Congelados arberjas = new Congelados("Arberjorro", 6, "500 gramos", 1000, 3);
        
        Aseo detergente = new Aseo("Ariel", 7, "2 litros", 5000, 2);
        Aseo lavaLoza = new Aseo("Quix", 8, "1 Litro", 2300, 2);
        
        Lista lista1 = new Lista();
        
        lista1.agregarProducto(aceite);
        lista1.agregarProducto(arroz);
        lista1.agregarProducto(bebida);
        lista1.agregarProducto(jugo);
        lista1.agregarProducto(choclo);
        lista1.agregarProducto(arberjas);
        lista1.agregarProducto(detergente);
        lista1.agregarProducto(lavaLoza);
       
        lista1.listarProductos();
        System.out.println("***********");
        
        
        
        
        
        
        
    }
    
}
