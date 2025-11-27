package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorPowTest extends BaseTest {

    @Test(dataProvider = "powData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing elevating to a power")
    public void testPow(Double x, Double y, Double result) {
        Assert.assertEquals(calc.pow(x,y),result,0.00001,"\n Problems elevating to a power\n");
    }

}
