package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorSubDoubleTest extends BaseTest {

    @Test(dataProvider = "subtractionDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing subtraction with Double values")
    public void testDoubleSub(Double x, Double y, Double result) {
        Assert.assertEquals(calc.sub(x,y),result,0.0001,"\n Problems subtracting two double values\n");
    }

}
