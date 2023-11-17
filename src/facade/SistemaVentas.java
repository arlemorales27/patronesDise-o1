package facade;

class SistemaVentas {

    private Inventario inventario;
    private Pago pago;
    private Envio envio;

    public SistemaVentas() {
        this.inventario = new Inventario();
        this.pago = new Pago();
        this.envio = new Envio();
    }

    public void venderProducto() {
        inventario.buscarProducto();
        inventario.reservarProducto();
        pago.cobrar();
        envio.enviar();
    }

}