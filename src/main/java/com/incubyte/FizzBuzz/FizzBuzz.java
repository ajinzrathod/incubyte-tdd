package com.incubyte.FizzBuzz;

import java.io.PrintStream;

public class FizzBuzz {
    private final int number;
    private PrintStream printStream;

    public FizzBuzz(int number, PrintStream printStream) {
        this.number = number;
        this.printStream = printStream;
    }

    public String compute() {
        return getFizzBuzz(number);
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    public void printAll() {
        for (int i = 1; i <= number; i++) {
            printStream.println(getFizzBuzz(i));
        }
    }

    private String getFizzBuzz(int i) {
        if(isDivisibleBy(i, 3)) {
            if(isDivisibleBy(i, 5)) {
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if(isDivisibleBy(i, 5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
