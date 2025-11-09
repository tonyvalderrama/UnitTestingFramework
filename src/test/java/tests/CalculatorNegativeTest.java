package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorNegativeTest extends BaseClass {

    @Test(dataProvider = "positiveNumbers",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing positive values")
    public void testPositive(Long value) {
        Assert.assertFalse(calc.isNegative(value),"Problem with a positive value");
    }

    @Test(dataProvider = "negativeNumbers",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing negative values")
    public void testNegative(Long value) {
        Assert.assertTrue(calc.isNegative(value),"Problem with a negative value");
    }
}
