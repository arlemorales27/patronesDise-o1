package factory;

class ProductoFactory {
    public static Producto getProducto(String tipo) {
        if (tipo.equalsIgnoreCase("A")) {
            return new ProductoA();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new ProductoB();
        }
        return null;
    }
}


