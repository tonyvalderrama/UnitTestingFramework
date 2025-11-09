package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorPositiveTest extends BaseClass {

    @Test(dataProvider = "positiveNumbers",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing positive values")
    public void testPositive(Long value) {
        Assert.assertTrue(calc.isPositive(value),"Problem with a positive value");
    }

    @Test(dataProvider = "negativeNumbers",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing negative values")
    public void testNegative(Long value) {
        Assert.assertFalse(calc.isPositive(value),"Problem with a negative value");
    }
}
