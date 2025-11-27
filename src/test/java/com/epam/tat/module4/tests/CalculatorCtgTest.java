package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorCtgTest extends BaseTest {

    @Test(dataProvider = "ctgData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing calculating hyperbolic tangent")
    public void testCtg(Double angle, Double result) {
        Assert.assertEquals(calc.ctg(angle),result,0.0001,"Hyperbolic tangent calculation failed");
    }

}
