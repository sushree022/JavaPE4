package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceOfCharacterTest {
    OccurrenceOfCharacter occurrenceOfCharacter;

    /* This methods runs, before running any one of the test case .
         It is used to initialize the required variables
  */
    @Before
    public void setup() {
//        arrange
        occurrenceOfCharacter= new OccurrenceOfCharacter();
    }

    /* This method runs, after running all the test cases
          It is used to clear the initialized variables
   */
    @After
    public void teardown()
    {
        occurrenceOfCharacter= null;
    }

    @Test
    public void givenStringInputShouldReturnAnInteger()
    {
//        act
        String input= "Java is java again java again";
        int actularesult= occurrenceOfCharacter.noOfOccurrenceOfCharacter(input);
//        assert
        assertEquals(10,actularesult);
    }

}