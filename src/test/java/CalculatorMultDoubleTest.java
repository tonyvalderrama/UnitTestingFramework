import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorMultDoubleTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "multiplicationDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing multiplication with Double values")
    public void testDoubleMult(Double x, Double y, Double result) {
        Assert.assertEquals(calc.mult(x,y),result,"\n Problems multiplying two double values\n");
    }

}
