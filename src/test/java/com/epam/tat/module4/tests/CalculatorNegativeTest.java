package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorNegativeTest extends BaseTest {

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
