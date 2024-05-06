/*
 * Class: CMSC201 
 * Instructor:
 * Description: junit test program
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Rodrigo Seer
*/

import org.junit.Test;
import static org.junit.Assert.*;

public class StringTest {
	
	
	@Test
	public void testingLength(){
		//change this srting to test it
		String stringTest = "testing JUnit";
		//change the parameters of JUnit, testing 13 words String
		assertEquals("the total length should be 13", 13, stringTest.length());
	}
	
	@Test
	public void testingSubstring() {
		//change this srting to test it
		String substringTest = "testing JUnit";
		assertEquals("the letter 'g' should be at position 6", 'g', substringTest.charAt(6));
		
	}
	
	@Test
	public void testingIndexOf() {
		//change this srting to test it
		String indexTest = "testing JUnit";
		assertEquals("the word JUnit should start at Index 8", 8, indexTest.indexOf("JUnit"));
		
		
	}
		
		

	}

