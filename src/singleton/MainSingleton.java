package singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Producto producto = Producto.getInstance();

        producto.setNombre("Televisor");
        producto.setPrecio(500.0);

        System.out.println(producto.getNombre());
        System.out.println(producto.getPrecio());
    }
}
