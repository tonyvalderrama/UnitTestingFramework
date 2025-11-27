package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorSqrtTest extends BaseTest {

    @Test(dataProvider = "sqrtData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing square root")
    public void testSqrt(Double x, Double result) {
        Assert.assertEquals(calc.sqrt(x),result,0.00001,"\n   Problems calculating the square root\n");
    }

}
