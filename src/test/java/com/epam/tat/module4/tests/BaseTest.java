package com.epam.tat.module4.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public Calculator calc;

    @BeforeClass
    public void setup() {
        calc = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calc = null;
    }
}
