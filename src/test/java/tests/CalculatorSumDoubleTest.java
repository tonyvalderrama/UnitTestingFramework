package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorSumDoubleTest extends BaseClass {

    @Test(dataProvider = "sumDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing sum with Double values")
    public void testLongSum(double x, double y, double result) {
        Assert.assertEquals(calc.sum(x,y),result,0.00001,"\n Problems adding two double values\n");
    }

}
