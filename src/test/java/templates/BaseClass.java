package templates;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }
}
