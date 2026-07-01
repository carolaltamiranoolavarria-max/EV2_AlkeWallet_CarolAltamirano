import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

    	Scanner teclado = new Scanner(System.in);

    	CuentaBancaria cuenta = null;
    	
        int opcion;

        do {

            System.out.println("\n========== ALKE WALLET ==========");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Convertir Saldo a USD");
            System.out.println("6. Mostrar Datos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
            
            case 1: //CREAR LA CUENTA

                teclado.nextLine();

                System.out.print("Nombre del Usuario: ");
                String nombreUsuario = teclado.nextLine();

                System.out.print("Número de Cuenta: ");
                int numeroCuenta = teclado.nextInt();

                System.out.println("\nSeleccione el tipo de cuenta");
                System.out.println("1. Billetera Digital");
                System.out.println("2. Tarjeta de Crédito");
                System.out.print("Opción: ");
                int tipoCuenta = teclado.nextInt();

                System.out.print("Saldo Inicial: ");
                double saldo = teclado.nextDouble();

                if (tipoCuenta == 1) {

                    cuenta = new BilleteraDigital(numeroCuenta, nombreUsuario, saldo);

                } else if (tipoCuenta == 2) {

                    System.out.print("Ingrese el cupo de crédito: ");
                    double cupo = teclado.nextDouble();

                    cuenta = new TarjetaCredito(numeroCuenta, nombreUsuario, saldo, cupo);

                } else {

                    System.out.println("Tipo de cuenta inválido.");
                    break;

                }

                System.out.println("\nCuenta creada correctamente.");
                System.out.println("Resumen de la cuenta:");

                cuenta.imprimir();

                break;
            case 2: // DEPOSITAR

                if (cuenta == null) {
                    System.out.println("Primero debe crear una cuenta.");
                    break;
                }

                System.out.print("Ingrese el monto a depositar: ");
                double montoDepositar = teclado.nextDouble();

                if (cuenta.depositar(montoDepositar)) {

                    System.out.println("Depósito realizado correctamente.");

                } else {

                    System.out.println("No fue posible realizar el depósito.");

                }

                break;
            case 3: // RETIRAR

                if (cuenta == null) {
                    System.out.println("Primero debe crear una cuenta.");
                    break;
                }

                System.out.print("Ingrese el monto a retirar: ");
                double montoRetirar = teclado.nextDouble();

                if (cuenta.retirar(montoRetirar)) {

                    System.out.println("Retiro realizado correctamente.");

                } else {

                    System.out.println("Saldo insuficiente o monto inválido.");

                }

                break;

            case 4: // CONSULTAR

                if (cuenta == null) {
                    System.out.println("Primero debe crear una cuenta.");
                    break;
                }

                System.out.println("Saldo disponible: $" + cuenta.consultarSaldo());

                break;
            case 5: // CONVERTIR

                if (cuenta == null) {
                    System.out.println("Primero debe crear una cuenta.");
                    break;
                }

                System.out.printf("Saldo en USD: %.2f USD%n", cuenta.convertirUSD());

                break;
            case 6: // MOSTRAR DATOS

                cuenta.imprimir();

                break;
            case 7:

                System.out.println("Gracias por utilizar Alke Wallet.");
                break;
            			default:

                System.out.println("Opción inválida.");

           

            }

        } while (opcion != 7);

        teclado.close();

    }

}