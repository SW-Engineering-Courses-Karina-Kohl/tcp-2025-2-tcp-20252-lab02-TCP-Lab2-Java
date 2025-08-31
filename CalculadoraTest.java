import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    private Calculadora calculadora;
    
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testSoma() {
        assertEquals(5, calculadora.somar(2, 3));
    }

    @Test
    void testDivisao() {
        assertEquals(2, calculadora.dividir(6, 3));
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
    }
}
