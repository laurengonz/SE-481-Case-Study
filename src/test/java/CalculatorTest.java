import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {calculator = new Calculator();}

    @After
    public void tearDown() {calculator = null;}

    @Test
    public void addPositiveNumbers() {
        double result = calculator.add(1, 1);
        double expected = 2.0;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void addNegativeNumbers() {
        double result = calculator.add(-1, -1);
        double expected = -2.0;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void subtractPositiveNumbers() {
        double result = calculator.subtract(1, 1);
        double expected = 0.0;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void subtractNegativeNumbers() {
        double result = calculator.subtract(-2, -1);
        double expected = -1.0;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void multiplyNumbers() {
        double result = calculator.multiply(2, 3);
        double expected = 6.0;
        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void divideNumbers() {
        double result = calculator.divide(10, 2);
        double expected = 5.0;
        Assert.assertEquals(expected, result, 0.0);
    }
}
