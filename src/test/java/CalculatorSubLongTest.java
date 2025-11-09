import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorSubLongTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "sumDataLong",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing sum with Long values")
    public void testLongSum(Long x, Long y, Long result) {
        Assert.assertEquals(calc.sum(x,y),result,"\n Problems adding two long values\n");
    }

}
