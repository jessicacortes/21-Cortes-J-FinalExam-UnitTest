package test.java;

import main.java.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest
{

    private StringCalculator manipulatedString = new StringCalculator();

    //Test add method to not include negative numbers, should fail
    @Test
    public void testAdd1()
    {
        assertThrows(InvalidParameterException.class, () -> manipulatedString.add("-1,5"));
    }

    // Test add method to ignore numbers bigger than 1000
    @Test
    public void testAdd2()
    {
        int actual = manipulatedString.add("1,1000");
        assertEquals(1,actual);
    }

    // Test add method String with only negative numbers
    @Test
    public void testAdd3()
    {
        assertThrows(InvalidParameterException.class, () -> manipulatedString.add("-1,-2,-3,-4"));
    }

    // Test add method
    @Test
    public void testAdd4()
    {
        int actual = manipulatedString.add("1001,1002, 1005, 999");
        assertEquals(999,actual);
    }

    // Test add method
    @Test
    public void testAdd5()
    {
        int actual = manipulatedString.add("1005,1000");
        assertEquals(0,actual);
    }
}


