package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorSumDoubleTest extends BaseTest {

    @Test(dataProvider = "sumDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing sum with Double values")
    public void testLongSum(double x, double y, double result) {
        Assert.assertEquals(calc.sum(x,y),result,0.00001,"\n Problems adding two double values\n");
    }

}
