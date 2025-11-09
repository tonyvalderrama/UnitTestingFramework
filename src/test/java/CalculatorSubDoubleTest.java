import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorSubDoubleTest {

    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @Test(dataProvider = "subtractionDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing subtraction with Double values")
    public void testDoubleSub(Double x, Double y, Double result) {
        double subtraction = calc.sub(x,y);
        boolean pass = Math.abs(result - subtraction) < 0.0001;
        Assert.assertTrue(pass,"\n Problems subtracting two double values\n");
    }

}
