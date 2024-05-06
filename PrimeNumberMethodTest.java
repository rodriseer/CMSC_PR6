/*
 * Class: CMSC201 
 * Instructor:
 * Description: jnuit method test for isPrime
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Rodrigo Seer
*/

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Test class for the PrimeNumberMethod class.
 */
public class PrimeNumberMethodTest {

    /**
     * tests the isPrime method of the PrimeNumberMethod class.
     */
    @Test
    public void testIsPrime() {
        // test for a common known prime number
        assertTrue("Should be prime number", PrimeNumberMethod.isPrime(3));
        // test for a known non prime number, common test assert to check if not prime
        assertFalse("This number should not be prime", PrimeNumberMethod.isPrime(18));
        // test for the smallest prime number which is 2
        assertTrue("2 should be prime", PrimeNumberMethod.isPrime(2));

    }
}
