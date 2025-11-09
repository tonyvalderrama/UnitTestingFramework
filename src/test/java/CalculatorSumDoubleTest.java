import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorSumDoubleTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "sumDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing sum with Double values")
    public void testLongSum(double x, double y, double result) {
        Assert.assertEquals(calc.sum(x,y),result,"\n Problems adding two double values\n");
    }

}
