package singleton;

public class Producto {
    private static Producto instance;
    private String nombre;
    private double precio;
    private Producto() {}

    public static Producto getInstance() {
        if(instance == null) {
            instance = new Producto();
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
