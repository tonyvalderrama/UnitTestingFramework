package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorSinTest extends BaseTest {

    @Test(dataProvider = "sinData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing calculating sine")
    public void testSin(Double angle, Double result) {
        Assert.assertEquals(calc.sin(angle),result,0.000001,"Sine calculation failed");
    }

}
