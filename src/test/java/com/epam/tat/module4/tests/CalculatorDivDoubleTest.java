package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorDivDoubleTest extends BaseTest {

    @Test(dataProvider = "divisionDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing division with Double values")
    public void testDoubleDiv(Double x, Double y, Double result) {
        Assert.assertEquals(calc.div(x,y),result,0.00001,"\n Problems dividing two double values\n");
    }

}
