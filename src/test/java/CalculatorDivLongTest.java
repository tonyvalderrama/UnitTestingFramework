import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorDivLongTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "divisionDataLong",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing division with Long values")
    public void testDoubleDiv(Long x, Long y, Long result) {
        Assert.assertEquals(calc.div(x,y),result,"\n Problems dividing two long values\n");
    }

    @Test(testName = "Testing long division by zero")
    public void testDivByZero() {
        Assert.expectThrows(NumberFormatException.class,() -> calc.div(23L, 0L));
    }

}
