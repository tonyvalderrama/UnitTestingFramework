import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorSqrtTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "sqrtData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing square root")
    public void testSqrt(Double x, Double result) {
        boolean equal = Math.abs(calc.sqrt(x) - result) < 0.00001;
        Assert.assertTrue(equal,"\n   Problems calculating the square root\n");
    }

}
