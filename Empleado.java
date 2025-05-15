
package trabajoEntornos;

public class Empleado {

    private int id;
    private String nombre;
    private String cargo;
    private int DNI;

    public Empleado(int id, String nombre, String cargo, int DNI) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.DNI = DNI;
    }

    public void procesarVentas() {
        System.out.println("El empleado " + nombre + " está procesando ventas.");
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void ascenderPuesto() {
        if (cargo.equals("Vendedor")) {
            cargo = "Jefe de Ventas";
        } else if (cargo.equals("Jefe de Ventas")) {
            cargo = "Gerente";
        }
        System.out.println("El empleado ha sido ascendido a: " + cargo);
    }
}