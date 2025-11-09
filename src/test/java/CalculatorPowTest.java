import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorPowTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "powData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing elevating to a power")
    public void testPow(Double x, Double y, Double result) {
        double powResult = calc.pow(x,y);
        boolean equal = Math.abs(powResult - result) < 0.00001;
        Assert.assertTrue(equal,"\n Problems elevating to a power\n");
    }

}
