public class TarjetaCredito extends CuentaBancaria implements Operaciones {

	private double saldo;
	private double cupoCredito;

	// CONSTRUCTORES VACIOS
	public TarjetaCredito() {
		super();
		this.saldo = 0;
		this.cupoCredito = 500000;
	}

	// CONSTRUCTORES CON PARÁMETROS
	public TarjetaCredito(int numeroCuenta, String nombreUsuario, double saldo, double cupoCredito) {
		super(numeroCuenta, nombreUsuario);
		this.saldo = saldo;
		this.cupoCredito = cupoCredito;
	}

	// GETTER AND SETTER
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getCupoCredito() {
		return cupoCredito;
	}

	public void setCupoCredito(double cupoCredito) {
		this.cupoCredito = cupoCredito;
	}

	// SOBREESCRIBIR EL MÉTODO IMPRIMIR DE LA SUPERCLASE
	@Override
	public void imprimir() {

		super.imprimir();

		System.out.println("Saldo : $" + this.saldo);
		System.out.println("Cupo de Crédito : $" + this.cupoCredito);

	}

	// DEPOSITAR DINERO
	@Override
	public boolean depositar(double monto) {

		if (monto > 0) {
			this.saldo += monto;
			return true;
		}

		return false;
	}

	// RETIRAR DINERO
	@Override
	public boolean retirar(double monto) {

		if (monto > 0 && monto <= this.saldo) {
			this.saldo -= monto;
			return true;
		}

		return false;
	}

	// CONSULTAR SALDO
	@Override
	public double consultarSaldo() {

		return this.saldo;
	}

	// CONVERTIR SALDO A USD
	@Override
	public double convertirUSD() {

		return this.saldo / VALOR_DOLAR;
	}

}