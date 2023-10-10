
/**
 *
 * @author arielmathias
 */
public class Abarrotes extends Producto{
    
    private String nombre;

    public Abarrotes() {
    }

    public Abarrotes(String nombreProducto, int codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.nombre = nombreProducto;
    }

    @Override
    public void listar() {
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Precio: "+ super.getPrecio());
        System.out.println("Cantidad: "+ super.getCantidad());
    }
    
}
