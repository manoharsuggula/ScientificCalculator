import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.Math;

public class ScientificCalculatorTest {

    ScientificCalculator sc = new ScientificCalculator(); 

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, sc.squareRoot(4),0.0f);
        assertEquals(3.0, sc.squareRoot(9),0.0f);
        assertEquals(4.0, sc.squareRoot(16),0.0f);
        assertNotEquals(15.0, sc.squareRoot(25),0.0f);
        assertNotEquals(9.0, sc.squareRoot(36),0.0f);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, sc.factorial(0),0.0f);
        assertNotEquals(10, sc.factorial(1),0.0f);
        assertEquals(6, sc.factorial(3),0.0f);
        assertNotEquals(204, sc.factorial(4),0.0f);
        assertEquals(720, sc.factorial(6),0.0f);
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.0, sc.naturalLogarithm(Math.E),0.2f);
        assertEquals(0.0, sc.naturalLogarithm(1),0.2f);
        assertNotEquals(5.6931, sc.naturalLogarithm(2),0.2f);
        assertNotEquals(11.3862, sc.naturalLogarithm(4),0.2f);
        assertEquals(2.3026, sc.naturalLogarithm(10),0.2f);
    }

    @Test
    public void testPower() {
        assertEquals(4.0, sc.power(2, 2),0.0f);
        assertNotEquals(108.0, sc.power(2, 3),0.0f);
        assertEquals(9.0, sc.power(3, 2),0.0f);
        assertNotEquals(89.0, sc.power(3, 4),0.0f);
        assertEquals(100.0, sc.power(10, 2),0.0f);
    }
}
