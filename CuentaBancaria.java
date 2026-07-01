
public class CuentaBancaria {

    protected int numeroCuenta;
    protected String nombreUsuario;

    public CuentaBancaria() {
        this.numeroCuenta = 0;
        this.nombreUsuario = "";
    }

    public CuentaBancaria(int numeroCuenta, String nombreUsuario) {
        this.numeroCuenta = numeroCuenta;
        this.nombreUsuario = nombreUsuario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void imprimir() {

        System.out.println("\n*** DATOS DE LA CUENTA ***");
        System.out.println("Número de Cuenta : " + this.numeroCuenta);
        System.out.println("Nombre Usuario   : " + this.nombreUsuario);

    }

    // Métodos que las subclases sobrescribirán

    public boolean depositar(double monto) {
        return false;
    }

    public boolean retirar(double monto) {
        return false;
    }

    public double consultarSaldo() {
        return 0;
    }

    public double convertirUSD() {
        return 0;
    }

}