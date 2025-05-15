package trabajoEntornos;

public class Test {

    public static void main(String[] args) {
        Producto p1 = new Producto(1, "Ratón", 10, 2);
        // Aquí actualiza el stock
        p1.actualizarStock();
        System.out.println("Después de actualizar stock 1 vez, disponibilidad: " + p1.getDisponibilidad()); // true
        p1.actualizarStock();
        System.out.println("Después de actualizar stock 2 veces, disponibilidad: " + p1.getDisponibilidad()); // false

        Producto p2 = new Producto(2, "Teclado", 20, 3);
        //Llaama a los metodos actualizar stock y vaciar
        p2.vaciarStock();
        System.out.println("Tras vaciar stock, disponibilidad: " + p2.getDisponibilidad()); // false
        p2.actualizarStock();
        System.out.println("Intento de actualizar stock vacío, disponibilidad: " + p2.getDisponibilidad()); // false
        //Aquí crea nuevos productos
        Producto p3 = new Producto(3, "Monitor", 150, 1);
        System.out.println("El nombre del producto es 'Monitor': " + p3.nombreProducto().equals("Monitor"));
        Producto p4 = new Producto(4, "Altavoz", 50, 1);
        System.out.println("El nombre del producto es 'Altavoz': " + p4.nombreProducto().equals("Altavoz"));
        
        Producto p5 = new Producto(5, "Tablet", 200, 1);
        System.out.println("El precio del producto 'Tablet' es 200: " + (p5.getPrecio() == 200));
        Producto p6 = new Producto(6, "Cámara", 99, 1);
        System.out.println("El precio del producto 'Cámara' es 99: " + (p6.getPrecio() == 99));
        //Agrega un nuevo producto a la compra
        Compra c1 = new Compra(1, "2025-05-08");
        c1.agregarProducto(p1);
        System.out.println("Se han agregado " + c1.getCantProductos() + " producto(s) a la compra.");
        c1.agregarProducto(p2);
        System.out.println("Se han agregado " + c1.getCantProductos() + " producto(s) a la compra.");

        Compra c2 = new Compra(2, "2025-05-08");
        c2.agregarProducto(p3);
        c2.agregarProducto(p4);
        System.out.println("El total calculado es: " + c2.calcularTotal() + " (esperado: 200)");
        c2.agregarProducto(p5);
        System.out.println("El nuevo total calculado es: " + c2.calcularTotal() + " (esperado: 400)");

        Compra c3 = new Compra(3, "2025-05-08");
        c3.agregarProducto(p6);
        c3.calcularTotal();
        System.out.println("Total con IVA (1 producto): " + c3.totalIva()); // 99 * 1.21

        c3.agregarProducto(p5);
        c3.calcularTotal();
        System.out.println("Total con IVA (2 productos): " + c3.totalIva()); // (99+200) * 1.21
    }
}
