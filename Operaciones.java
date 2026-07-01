
public interface Operaciones {

    static double VALOR_DOLAR = 900;

    boolean depositar(double monto);

    boolean retirar(double monto);

    double consultarSaldo();

    double convertirUSD();

}
