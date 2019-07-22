package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacementOfCharacterTest {
    ReplacementOfCharacter replacementOfCharacter;

    /* This methods runs, before running any one of the test case .
            It is used to initialize the required variables
     */
    @Before
    public void setup()
    {
//        arrange
        replacementOfCharacter= new ReplacementOfCharacter();
    }

    /* This method runs, after running all the test cases
              It is used to clear the initialized variables
       */
    @After
    public void teardown()
    {
        replacementOfCharacter= null;
    }

    @Test
    public void givenInputStringShouldReturnStringWithReplacedCharacters()
    {
//        act
        String input= "daily dry";
        String actualResult= replacementOfCharacter.replaceCharacter(input);
//        assert
        String expectedResult= "faity fry";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenInputStringWithUppercaseShouldReturnStringWithReplacedCharacters() {
//        act
        String input = "Daily Lie";
        String actualResult = replacementOfCharacter.replaceCharacter(input);
//        assert
        String expectedResult = "faity tie";
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldReturnNullPointerException()
    {
        this.replacementOfCharacter.replaceCharacter(null);
    }
}