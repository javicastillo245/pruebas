package trabajoEntornos;

public class Producto {
    //Declaramos variables
    private int id;
    private String nombre;
    float precio;
    private int stock;
    private boolean disponibilidad;

    // Constructor
    public Producto(int id, String nombre, float precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.disponibilidad = stock > 0;
    }
    // Actualiza el stock
    public void actualizarStock() {
        if (stock > 0) {
                stock--;
            if (stock == 0) {
                disponibilidad = false;
            }
        }
    }
    //Get y set
    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    //Vacia el stock
    public void vaciarStock() {
        stock = 0;
        disponibilidad = false;
    }    
    //Devuelve el nombre del producto
    public String nombreProducto() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
