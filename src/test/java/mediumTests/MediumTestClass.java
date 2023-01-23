package mediumTests;

import application.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class MediumTestClass {

    private void verification(double actualResult, double expectedResult, String assertText) {
        Assert.assertTrue(assertText, actualResult == expectedResult);
    }

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - average value
    @Test
    public void testAverageValueOfThreeNumbers(){
        double actualResult = calc.averageValueOfThreeNumbers(3,5,7);
        double expectedResult = 5;
        verification(actualResult, expectedResult,"average Value Of Three Numbers must be 5");
    }

    //TODO (**)
    //add tests for new method - even or odd
    @Test
    public void testEvenOdd(){
        boolean actualResult = calc.evenOdd(8);
        Assert.assertTrue("The digit is not even!", actualResult);
    }

    //TODO (**)
    //add tests for new method - biggest value
    @Test
    public void testBiggerNumber(){
        double actualResult = calc.biggerNumber(3,7);
        double expectedResult = 7;
        verification(actualResult, expectedResult,"bigger Number must be 7");
    }

}