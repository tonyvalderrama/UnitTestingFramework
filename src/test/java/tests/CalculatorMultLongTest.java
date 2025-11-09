package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorMultLongTest extends BaseClass {

    @Test(dataProvider = "multiplicationDataLong",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing multiplication with long values")
    public void testDoubleMult(Long x, Long y, Long result) {
        Assert.assertEquals(calc.mult(x,y),result,"\n Problems multiplying two long values\n");
    }

}
