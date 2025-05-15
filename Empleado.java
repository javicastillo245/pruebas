
package trabajoEntornos;

public class Empleado {
    //Declaramos Variables
    private int id;
    private String nombre;
    private String cargo;
    private int DNI;
    //Método constructor
    public Empleado(int id, String nombre, String cargo, int DNI) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.DNI = DNI;
    }
    //Indica quien procesa la venta
    public void procesarVentas() {
        System.out.println("El empleado " + nombre + " está procesando ventas.");
    }
    //Get y Set
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    //Indica a que puesto asciende
    public void ascenderPuesto() {
        if (cargo.equals("Vendedor")) {
            cargo = "Jefe de Ventas";
        } else if (cargo.equals("Jefe de Ventas")) {
            cargo = "Gerente";
        }
        System.out.println("El empleado ha sido ascendido a: " + cargo);
    }
}
