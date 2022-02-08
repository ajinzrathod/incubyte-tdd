package com.incubyte;

import com.incubyte.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzShould {

    @Test
    public void compute_fizz_if_multiple_of_three() {
        FizzBuzz fizzbuzz = new FizzBuzz(3, System.out);
        assertEquals("Fizz", fizzbuzz.compute());
    }

    @Test
    public void compute_buzz_if_multiple_of_five() {
        FizzBuzz fizzbuzz = new FizzBuzz(5, System.out);
        assertEquals("Buzz", fizzbuzz.compute());
    }

    @Test
    public void compute_fizz_buzz_if_multiple_of_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(15, System.out);
        assertEquals("FizzBuzz", fizzBuzz.compute());
    }

    @Test
    public void compute_n_if_not_divisible_by_3_or_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(98, System.out);
        assertEquals("98", fizzBuzz.compute());
    }

    @Mock
    PrintStream printStream;

    @Test
    public void should_print_all_from_1_to_n() {
        FizzBuzz fizzBuzz = new FizzBuzz(15, printStream);
        fizzBuzz.printAll();
        verify(printStream, times(4)).println("Fizz");
        verify(printStream, times(2)).println("Buzz");
        verify(printStream, times(1)).println("FizzBuzz");
    }
}
