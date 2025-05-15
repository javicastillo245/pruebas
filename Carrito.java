
package trabajoEntornos;

public class Carrito {
     // Array que almacena los productos en el carrito
    private Producto[] productos;
      // Contador que indica cuántos productos hay en el carrito
    private int cantidad;
    // Constructor de la clase Carrito
    public Carrito() {
        productos = new Producto[100]; // tamaño fijo
        cantidad = 0;
    }
    // Método para agregar un producto al carrito
    public void agregarProducto(Producto p) {
        if (cantidad < productos.length) {
            productos[cantidad] = p;
            cantidad++;
        }
    }
    // Método para borrar un producto del carrito
    public void borrarProducto(Producto p) {
        for (int i = 0; i < cantidad; i++) {
            if (productos[i] == p) {
                for (int j = i; j < cantidad - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                productos[cantidad - 1] = null;
                cantidad--;
                return;
            }
        }
    }
    // Método para vaciar el carrito
    public void vaciarCarrito() {
        for (int i = 0; i < cantidad; i++) {
            productos[i] = null;
        }
        cantidad = 0;
    }
    // Método para calcular el total del carrito
    public float calcularTotal() {
        float total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
    //Getters y Setters
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Producto[] getProductos() {
        return productos;
    }
}
