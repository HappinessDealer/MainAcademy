package simpleTests;

import application.Calculator;
import org.junit.Assert;
import org.junit.Test;


public class SimpleTestClass {
    private void verification(double actualResult, double expectedResult, int funA, int funB, int result) {
        Assert.assertTrue(funA + " + " + funB + " must be " + result, actualResult == expectedResult);
    }

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(18, 2);
        int expectedResult = 20;
        verification(actualResult, expectedResult, 18, 2, expectedResult);
    }

    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)

    @Test
    public void testMultiplyVariables() {
        int actualResult = calc.testMultiply(18, 2);
        int expectedResult = 36;
        verification(actualResult, expectedResult, 18,2,36);
    }

    @Test
    public void testDivedTwoVariables() {
        int actualResult = calc.testDivid(18, 2);
        int expectedResult = 9;
        verification(actualResult, expectedResult, 18, 2, 9);
    }

    @Test
    public void testSubtractionTwoVariables() {
        int actualResult = calc.testSubtract(18, 2);
        int expectedResult = 16;
        verification(actualResult, expectedResult, 18, 2, 16);
    }


@Test
    public void testSquareRootVariable() {
        double actualResult = calc.testSquareRoot(18);
        double expectedResult = 4.242640687119285;
        Assert.assertTrue(" ", actualResult == expectedResult);
    }

    @Test
    public void testPow() {
        double actualResult = calc.testPow(18, 2);
        double expectedResult = 324;
        verification(actualResult, expectedResult, 18, 2, 324);
    }
}

