package com.epam.tat.module4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.tat.module4.dataservices.TestDataProvider;

public class CalculatorSubLongTest extends BaseTest {

    @Test(dataProvider = "sumDataLong",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing sum with Long values")
    public void testLongSum(Long x, Long y, Long result) {
        Assert.assertEquals(calc.sum(x,y),result,"\n Problems adding two long values\n");
    }

}
