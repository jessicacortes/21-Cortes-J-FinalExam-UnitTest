package main.java;

import java.security.InvalidParameterException;

public class StringCalculator
{

    public static int add(final String numbers)
    {
        int returnValue= 0;
        String[] numbersArray = numbers.split(",|\n");
        for(String number: numbersArray)
        {
            if( !number.trim().isEmpty())
            {
                int current = Integer.parseInt(number.trim());
                if(current < 0)
                {
                    throw new InvalidParameterException();
                }
                if( current < 1000)
                {
                    returnValue += current;
                }
            }
        }
        return returnValue;
    }
}
