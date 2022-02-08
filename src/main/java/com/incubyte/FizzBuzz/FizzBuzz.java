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
        if(isDivisibleBy(3)) {
            if(isDivisibleBy(5)) {
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if(isDivisibleBy(5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleBy(int divisor) {
        return number % divisor == 0;
    }

    public void printAll() {
        for (int i = 1; i <= number; i++) {
            printStream.println(new FizzBuzz(i, printStream).compute());
        }
    }
}
