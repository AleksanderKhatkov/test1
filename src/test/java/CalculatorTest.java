import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class CalculatorTest {
    Calculator calculator;

    @BeforeTest
        // Метод с этой аннотацией запускается перед запуском первого метода с аннотацией @Test.
    void initTest() {
        calculator = new Calculator();
    }

    @BeforeMethod
        // Методы с этой аннотацией запускаются перед каждым @Test-методом. Вы можете использовать её, чтобы перед выполнением теста проверить соединение с базой данных.
    void before() {
        calculator.LastResult = "";
    }

    @Test
    public void testSum() {
        Assert.assertEquals(calculator.sum(3, 7), 10);
    }

    //positive function Division
    @Test
    public void testDivision() {
        int result = calculator.division(25, 5);
        if (result == 0) {
            Assert.fail("Expected : You cannot divide by zero");
        } else
            Assert.assertEquals(result, 5);
    }

    //negatives function Division
    @Test
    void negativeTestDivision() {
        Assert.assertNotEquals(calculator.division(25, 5), 80);
    }

    //positive function Subtraction
    @Test
    public void testSubtraction() {
        Assert.assertEquals(calculator.subtraction(10, 5), 5);
    }

    // negatives function Subtraction
    @Test
    public void negativeTestSubtraction() {
        Assert.assertNotEquals(calculator.subtraction(10, 5), 67);
    }

    //positive function Module
    @Test
    public void testModule() {
        Assert.assertEquals(calculator.module(-25, 5), 30);
    }

    //negatives function Module
    @Test
    public void negativeTestModule() {
        Assert.assertNotEquals(calculator.module(-25, 5), -30);
    }
}
