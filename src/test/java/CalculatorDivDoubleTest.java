import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorDivDoubleTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "divisionDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing division with Double values")
    public void testDoubleDiv(Double x, Double y, Double result) {
        Assert.assertEquals(calc.div(x,y),result,"\n Problems dividing two double values\n");
    }

}
