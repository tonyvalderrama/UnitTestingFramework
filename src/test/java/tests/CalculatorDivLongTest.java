package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorDivLongTest extends BaseClass {

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
