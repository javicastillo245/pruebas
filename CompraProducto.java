
package trabajoEntornos;

public class CompraProducto {

    private int id_compra;
    private int id_producto;

    public CompraProducto(int id_compra, int id_producto) {
        this.id_compra = id_compra;
        this.id_producto = id_producto;
    }

    public void pagarProducto() {
        System.out.println("Producto con ID " + id_producto + " pagado en compra " + id_compra);
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public void seleccionarProducto(int atributo) {
        this.id_producto = atributo;
        System.out.println("Producto seleccionado con ID: " + atributo);
    }

    public int getId_producto() {
        return id_producto;
    }
}