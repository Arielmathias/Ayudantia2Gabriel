
import java.util.ArrayList;


/**
 *
 * @author arielmathias
 */
public class Lista {
    
    private ArrayList<Producto> listaProductos;
    
    public Lista(){
        listaProductos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto){
        
        this.listaProductos.add(producto);
        
    }
    
    public void listarProductos(){
        int suma = 0;
        System.out.println("Codigo \t Precio \tCantidad \tTotal");
        for (Producto listaProducto : listaProductos) {
            System.out.println(listaProducto.getCodigo()+"\t"+listaProducto.getPrecio()+"\t\t"+listaProducto.getCantidad()+"\t\t"+listaProducto.getPrecio()*listaProducto.getPrecio());
            suma = suma +listaProducto.getCantidad()*listaProducto.getPrecio();
            System.out.println("**************************************");
            System.out.println("Total = "+ suma);
        }
    }

       
}
