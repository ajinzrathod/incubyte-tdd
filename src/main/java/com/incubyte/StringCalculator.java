package com.incubyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public static int Add(String numbers) {
        if(numbers.equals("")){
            return 0;
        }
        String delimeters = ",|\n";

        if(numbers.startsWith("//")){
            String custom_delimeter = String.valueOf(numbers.charAt(2));
            numbers = numbers.substring(3);
            delimeters = delimeters + "|" + custom_delimeter;
            System.out.println(delimeters);
        }

        int total = 0;
        String[] arrOfStr = numbers.split(delimeters);
        for (String num: arrOfStr) {
            int number = Integer.parseInt(num);
            if(number < 0){
                continue;
            }
            total += number;
        }
        return total;
    }
}
