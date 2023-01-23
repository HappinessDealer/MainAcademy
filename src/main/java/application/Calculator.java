package application;

import java.util.List;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    //TODO add method for subtraction
    public static int testSubtract(int a, int b) {
        return a - b;
    }

    //TODO add method for multiplication
    public static int testMultiply(int a, int b) {
        return a * b;
    }

    //TODO add method for division
    public int testDivid(int a, int b) {
        return a / b;
    }

    //TODO add method for square root (use Math class)
    public double testSquareRoot(int a) {
        return Math.sqrt(a);
    }

    //TODO add method for x^2
    public double testPow(double a, double b) {
        return Math.pow(a, b);
    }

    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers
    public static int averageValueOfThreeNumbers(int a, int b, int c) {
        int sum = (a + b + c) / 3;
        return sum;
    }

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd
    public static boolean evenOdd(int number) {
        boolean counter = false;
        if (number % 2 == 0) {
            counter = true;
        } else {
            counter = false;
        }
        return counter;
    }

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals
    public static int biggerNumber(int numberOne, int numberTwo) {
        int maxNumber = 0;
        if (numberOne < numberTwo) {
            maxNumber = numberTwo;
        }
        if (numberOne > numberTwo) {
            maxNumber = numberOne;
        }
        if (numberOne == numberTwo) {
            maxNumber = 0;
        }
        return maxNumber;
    }

    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter
    public static int countSumOfQuantityParam(List<Integer> parameters) {
        int result = 0;
        for (Integer param : parameters) {
            result += param;
        }
        return result;
    }

    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;


}
