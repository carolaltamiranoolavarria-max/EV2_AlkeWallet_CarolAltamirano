import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class BilleteraTest {

    @Test
    void testDepositar() {

        BilleteraDigital billetera = new BilleteraDigital(1001, "Carol", 100000);

        boolean resultado = billetera.depositar(50000);

        assertTrue(resultado);

        assertEquals(150000, billetera.consultarSaldo());
    }
    
     @Test
        void testRetirar() {

            BilleteraDigital billetera = new BilleteraDigital(1001, "Carol", 100000);

            boolean resultado = billetera.retirar(30000);

            assertTrue(resultado);

            assertEquals(70000, billetera.consultarSaldo());
     }
     @Test
     void testConsultarSaldo() {

         BilleteraDigital billetera = new BilleteraDigital(1001, "Carol", 85000);

         assertEquals(85000, billetera.consultarSaldo());

     }
     @Test
     void testConvertirUSD() {

         BilleteraDigital billetera = new BilleteraDigital(1001, "Carol", 90000);

         assertEquals(100, billetera.convertirUSD());

     }
     @Test
     void testRetiroSinSaldo() {

         BilleteraDigital billetera = new BilleteraDigital(1001, "Carol", 10000);

         boolean resultado = billetera.retirar(50000);

         assertFalse(resultado);

     }

    
    }
