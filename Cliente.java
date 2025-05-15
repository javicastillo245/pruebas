
package trabajoEntornos;

public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private String telefono;

    public Cliente(int id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void realizarCompra() {
        System.out.println("Compra realizada por el cliente: " + nombre);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void llamarCliente() {
        System.out.println("Llamando al cliente " + nombre + " al teléfono " + telefono);
    }

    public void escribirCorreo() {
        System.out.println("Enviando correo a " + correo);
    }
  }