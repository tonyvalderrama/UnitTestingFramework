package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorSubDoubleTest extends BaseClass {

    @Test(dataProvider = "subtractionDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing subtraction with Double values")
    public void testDoubleSub(Double x, Double y, Double result) {
        Assert.assertEquals(calc.sub(x,y),result,0.0001,"\n Problems subtracting two double values\n");
    }

}
