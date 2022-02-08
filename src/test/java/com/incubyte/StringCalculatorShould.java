package com.incubyte;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringCalculatorShould {
    @Test
    public void return_0_if_empty_string(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.Add(""));
    }

    @Test
    public void return_number_if_single_number_is_passed(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(4, stringCalculator.Add("4"));
    }

    @Test
    public void return_sum_of_numbers_when_seperated_by_commas(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.Add("1,2,3"));
    }
    @Test
    public void return_sum_of_numbers_when_seperated_by_commas_or_slashN(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.Add("1,2\n3"));
    }
    @Test
    public void return_sum_of_numbers_when_seperated_by_commas_or_slashN_or_custom_seperators(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.Add("//;1,2\n3"));
    }
    @Test
    public void return_sum_of_numbers_and_disallow_negatives(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.Add("//;1,2\n-3"));
    }

}
