public class BilleteraDigital extends CuentaBancaria implements Operaciones {

	private double saldo;

	// CONSTRUCTORES VACIOS
	public BilleteraDigital() {
		super();
		this.saldo = 0;
	}

	// CONSTRUCTORES CON PARÁMETROS
	public BilleteraDigital(int numeroCuenta, String nombreUsuario, double saldo) {
		super(numeroCuenta, nombreUsuario);
		this.saldo = saldo;
	}

	// GETTER AND SETTER
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// SOBREESCRIBIR EL MÉTODO IMPRIMIR DE LA SUPERCLASE
	@Override
	public void imprimir() {

		super.imprimir();

		System.out.println("Saldo : $" + this.saldo);
	}

	// DEPOSITA DINERO 
	@Override
	public boolean depositar(double monto) {

		if (monto > 0) {
			this.saldo += monto;
			return true;
		}

		return false;
	}

	// RETIRA DINERO
	@Override
	public boolean retirar(double monto) {

		if (monto > 0 && monto <= this.saldo) {
			this.saldo -= monto;
			return true;
		}

		return false;
	}

	// CONSULTA EL SALDO
	@Override
	public double consultarSaldo() {

		return this.saldo;
	}

	// CONVIERTE EL SALDO A DÓLARES
	@Override
	public double convertirUSD() {

		return this.saldo / VALOR_DOLAR;
	}

}