package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorSubLongTest extends BaseClass {

    @Test(dataProvider = "sumDataLong",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing sum with Long values")
    public void testLongSum(Long x, Long y, Long result) {
        Assert.assertEquals(calc.sum(x,y),result,"\n Problems adding two long values\n");
    }

}
