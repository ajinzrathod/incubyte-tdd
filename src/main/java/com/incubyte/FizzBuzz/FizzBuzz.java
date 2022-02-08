package com.incubyte.FizzBuzz;

public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
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
}
