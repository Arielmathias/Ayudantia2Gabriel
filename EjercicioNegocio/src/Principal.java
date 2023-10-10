
import java.util.Scanner;


/**
 *
 * @author arielmathias
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Lista lista1 = new Lista();
        
        Abarrotes aceite = new Abarrotes("Lider", 1, "Bonito", 10, 2);
        Abarrotes azucar = new Abarrotes("Cuenta", 2, "Brillante", 20, 2);
        Abarrotes lentejas = new Abarrotes("Jumbo", 3, "Agradable", 40, 3);
        
        Liquidos bebida = new Liquidos("Cocacola", 4, "Negra", 50, 4);
        Liquidos jugo = new Liquidos("Watts", 5, "Naranja", 60, 3);
        Liquidos cerveza = new Liquidos("Corona", 6, "Amarilla", 70, 5);
        
        lista1.agregarProducto(aceite);
        lista1.agregarProducto(azucar);
        lista1.agregarProducto(lentejas);
        lista1.agregarProducto(bebida);
        lista1.agregarProducto(jugo);
        lista1.agregarProducto(cerveza);
       
        
        while (true){
            
            System.out.println("1.- Visualizar");
            System.out.println("2.- Calcular Total");
            System.out.println("3.- Salir");
            
            int opc = leer.nextInt();
            
            switch(opc){
                
                case 1:
                    lista1.listarProductos();
                    
                    break;
                case 2:
                    lista1.calcularTotal();
                    break;
                case 3:
                    return;
                            
                          
            }
        }
    }
}