package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorMultDoubleTest extends BaseTest {

    @Test(dataProvider = "multiplicationDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing multiplication with Double values")
    public void testDoubleMult(Double x, Double y, Double result) {
        Assert.assertEquals(calc.mult(x,y),result,"\n Problems multiplying two double values\n");
    }

}
