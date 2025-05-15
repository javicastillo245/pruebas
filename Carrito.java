
package trabajoEntornos;

public class Carrito {
    private Producto[] productos;
    private int cantidad;

    public Carrito() {
        productos = new Producto[100]; // tamaño fijo
        cantidad = 0;
    }
    public void agregarProducto(Producto p) {
        if (cantidad < productos.length) {
            productos[cantidad] = p;
            cantidad++;
        }
    }
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
    public void vaciarCarrito() {
        for (int i = 0; i < cantidad; i++) {
            productos[i] = null;
        }
        cantidad = 0;
    }
    public float calcularTotal() {
        float total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
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
