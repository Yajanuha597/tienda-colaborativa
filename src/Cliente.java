public class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre);
    }
}