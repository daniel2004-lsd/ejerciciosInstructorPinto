public class BancoFactory implements ServicioBanFactory {
    public ProductoBancario crearProductoBancario( int tipoProducto){
        return switch (tipoProducto){
            case 1 -> new CuentaAhorros();
            case 2 -> new CuentaCorriente();
            case 3 -> new TarjetaCredito();
            case 4 -> new CDT();
            default -> null;
        };
    }

    @Override
    public Prestamos crearPrestamo(int tipoPrestamo) {
        return switch (tipoPrestamo) {
            case 1 -> new PrestamoLibranza();
            case 2 -> new PrestamoInversion();
            case 3 -> new PrestamoHipoteca();
            default -> null;
        };
    }
}
