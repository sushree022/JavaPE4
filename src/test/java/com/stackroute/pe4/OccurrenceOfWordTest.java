package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceOfWordTest {
    OccurrenceOfWord occurrenceOfWord;



    /* This methods runs, before running any one of the test case .
            It is used to initialize the required variables
     */
    @Before
    public void setup() {
//        arrange
        occurrenceOfWord= new OccurrenceOfWord();
    }

    /* This method runs, after running all the test cases
          It is used to clear the initialized variables
   */
    @After
    public void teardown()
    {

        occurrenceOfWord= null;
    }

    @Test
    public void givenStringInputShouldReturnAString()
    {
//        act
        String input= "She sells seashells by the seashore";
        String repeatWord="se";
        String actulaResult= occurrenceOfWord.occurrenceOfParticularWord(input, repeatWord);
//        assert
        String expectedResult= "Found at:4-6\n" +"Found at:10-12\n" + "Found at:27-29";
        assertEquals(expectedResult,actulaResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()
    {
        this.occurrenceOfWord.occurrenceOfParticularWord(null, null);
    }

}