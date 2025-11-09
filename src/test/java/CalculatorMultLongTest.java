import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorMultLongTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "multiplicationDataLong",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing multiplication with long values")
    public void testDoubleMult(Long x, Long y, Long result) {
        Assert.assertEquals(calc.mult(x,y),result,"\n Problems multiplying two long values\n");
    }

}
