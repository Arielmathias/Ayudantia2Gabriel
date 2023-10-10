
import java.util.Scanner;


/**
 *
 * @author arielmathias
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Lista listaUno = new Lista();
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        
        Telefono iphone = new Telefono("Iphone", "14", "Catorce", 1000000, "Celular", 4);
        Telefono motorola = new Telefono("Motorola", "g5", "gecinco", 400000, "Celular", 5);
        
        
        
        listaUno.agregarProducto(iphone);
        listaUno.agregarProducto(motorola);
        while(true){
            
            System.out.println("Bienvenido");
            System.out.println("1.- Visualizar");
            System.out.println("2.- Buscar");
            System.out.println("3.- Salir");
            
            opc = leer.nextInt();
            switch(opc){
                
                case 1:
                    
                    
                case 2:
                    break;
                
                case 3: 
                    break;
            }
            
        }
        
       
        
        
        
        
        
    }
    
}
