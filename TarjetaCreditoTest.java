import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class TarjetaCreditoTest {

    @Test
    void testDepositar() {

    	TarjetaCredito tarjeta = new TarjetaCredito(1001, "Carol", 100000, 0);

        boolean resultado = tarjeta.depositar(50000);

        assertTrue(resultado);

        assertEquals(150000, tarjeta.consultarSaldo());
    }
    
     @Test
        void testRetirar() {

    	 TarjetaCredito tarjeta = new TarjetaCredito(1001, "Carol", 100000, 0);
            boolean resultado = tarjeta.retirar(30000);

            assertTrue(resultado);

            assertEquals(70000, tarjeta.consultarSaldo());
     }
     @Test
     void testConsultarSaldo() {

    	 TarjetaCredito tarjeta = new TarjetaCredito(1001, "Carol", 85000, 0);

         assertEquals(85000, tarjeta.consultarSaldo());

     }
     @Test
     void testConvertirUSD() {

    	 TarjetaCredito tarjeta = new TarjetaCredito(1001, "Carol", 90000, 0);

         assertEquals(100, tarjeta.convertirUSD());

     }
     @Test
     void testRetiroSinSaldo() {

    	 TarjetaCredito tarjeta = new TarjetaCredito(1001, "Carol", 10000, 0);

         boolean resultado = tarjeta.retirar(50000);

         assertFalse(resultado);

     }

    
    }