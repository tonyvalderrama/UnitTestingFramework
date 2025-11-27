package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorCosTest extends BaseTest {
    @Test(dataProvider = "cosData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing calculating cosine")
    public void testCos(Double angle, Double result) {
        // The cos method has an error in the Jar file class... it returns Math.sin instead of Math.cos
        Assert.assertEquals(calc.cos(angle),result,0.000001,"Cosine calculation failed");
    }

}
