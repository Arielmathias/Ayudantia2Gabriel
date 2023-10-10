
/**
 *
 * @author arielmathias
 */
public class Oferta extends Producto{
    
    private double descuento;

    public Oferta() {
    }
    

    public Oferta(double descuento, int codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
        
    }
    

    @Override
    public String toString() {
        return "Oferta{" + "descuento=" + descuento + '}';
    }

    @Override
    public void listar() {
        
        System.out.println("Codigo: "+ super.getCodigo());
        System.out.println("Descripcion: "+ super.getDescripcion());
        System.out.println("Precio "+ super.getPrecio());
        System.out.println("Descuento: "+this.getDescuento());
        
    }
    
    
    
    
}
