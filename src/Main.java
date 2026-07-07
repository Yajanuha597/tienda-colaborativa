public class Main {

    public static void main(String[] args) {

        Producto producto = new Producto("Laptop", 850);

        producto.aplicarDescuento(10);

        producto.mostrarProducto();
    }
}