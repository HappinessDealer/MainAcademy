package hardTests;

import application.Calculator;
import org.junit.Test;

import java.util.Arrays;

import static application.Calculator.countSumOfQuantityParam;

public class HardTestClass {

    //TODO (**)
    //add tests for new method - divide by zero case

    //TODO (**)
    //add tests for new method - addition with multiple parameters
    @Test
    public void multipleParam() {
        countSumOfQuantityParam(Arrays.asList(1, 2, 3, 5, 6));
    }


}