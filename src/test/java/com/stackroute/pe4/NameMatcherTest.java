package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameMatcherTest {
    NameMatcher nameMatcher;

    /* This methods runs, before running any one of the test case .
         It is used to initialize the required variables
  */
    @Before
    public void setup() {
//        arrange
        nameMatcher= new NameMatcher();
    }

    /* This method runs, after running all the test cases
          It is used to clear the initialized variables
   */
    @After
    public void teardown()
    {
        nameMatcher= null;
    }

    @Test
    public void givenStringInputShouldReturnTrue()
    {
//        act
        String input= "This is Harry";
        Boolean actularesult= nameMatcher.matchingString(input);
//        assert
        Boolean expectedResult= true;
        assertEquals(expectedResult,actularesult);
    }

    @Test
    public void givenStringInputShouldReturnFalse()
    {
//        act
        String input= "This is marry";
        Boolean actularesult= nameMatcher.matchingString(input);
//        assert
        Boolean expectedResult= false;
        assertEquals(expectedResult,actularesult);
    }


    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldReturnNullPointerException()
    {

        this.nameMatcher.matchingString(null);
    }
}
