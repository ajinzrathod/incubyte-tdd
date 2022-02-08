package com.incubyte;

import com.incubyte.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    public void compute_fizz_if_multiple_of_three() {
        FizzBuzz fizzbuzz = new FizzBuzz(3);
        assertEquals("Fizz", fizzbuzz.compute());
    }
    @Test
    public void compute_buzz_if_multiple_of_five() {
        FizzBuzz fizzbuzz = new FizzBuzz(5);
        assertEquals("Buzz", fizzbuzz.compute());
    }
    @Test
    public void compute_fizz_buzz_if_multiple_of_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertEquals("FizzBuzz", fizzBuzz.compute());
    }
    @Test
    public void compute_n_if_not_divisible_by_3_or_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(98);
        assertEquals("98", fizzBuzz.compute());
    }
}
