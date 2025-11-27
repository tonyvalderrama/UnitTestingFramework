package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorDivLongTest extends BaseTest {

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
