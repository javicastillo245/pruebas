package trabajoEntornos;

public class Compra {
    //Inicializamos variables
    private int id;
    private String fecha;
    private float total;
    private int cantProductos;
    private Producto[] productos;
    //metodo constructor
    public Compra(int id, String fecha) {
        this.id = id;
        this.fecha = fecha;
        this.total = 0;
        this.cantProductos = 0;
        this.productos = new Producto[100];
    }
    //Método para agrigar productos
    public void agregarProducto(Producto p) {
        if (cantProductos < productos.length) {
            productos[cantProductos] = p;
            total += p.getPrecio();
            cantProductos++;
        }
    }
    //Método que calcula el total de la compra
    public float calcularTotal() {
        float suma = 0;
        for (int i = 0; i < cantProductos; i++) {
            suma += productos[i].precio;
        }
        total = suma;
        return total;
    }
    //Get y set
    public int getCantProductos() {
        return cantProductos;
    }
    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }
    //Indica el total sumado al IVA
    public float totalIva() {
        return (float) (total * 1.21); 
    }
}
