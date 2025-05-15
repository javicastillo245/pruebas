
package trabajoEntornos;

public class Cliente {
    //Inicializamos las variables
    private int id;
    private String nombre;
    private String correo;
    private String telefono;
    //Método constructor
    public Cliente(int id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    //Indica quienn realiza la compra
    public void realizarCompra() {
        System.out.println("Compra realizada por el cliente: " + nombre);
    }
    //get y set
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //Indica quien y a quien se está llamando

    public void llamarCliente() {
        System.out.println("Llamando al cliente " + nombre + " al teléfono " + telefono);
    }
    //Indica a quien se le envia el correo
    public void escribirCorreo() {
        System.out.println("Enviando correo a " + correo);
    }
  }
