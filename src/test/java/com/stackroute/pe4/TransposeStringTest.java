package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;

    /* This methods runs, before running any one of the test case .
              It is used to initialize the required variables
       */
    @Before
    public  void setup()
    {
//        arrange
        transposeString= new TransposeString();
    }

    /* This method runs, after running all the test cases
                  It is used to clear the initialized variables
           */
    @After
    public void teardown()
    {
        transposeString= null;
    }

    @Test
    public void givenInputStringShouldReturnAStringWithSortedWordsInAlphabeticalOrder()
    {
//        act
        String input= "world is beautiful";
        String actualResult=transposeString.transposeWordsOfAString(input);
//        assert
        String expectedResult= "dlrow si lufituaeb";
        assertEquals(expectedResult,actualResult);

    }
    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()
    {
        this.transposeString.transposeWordsOfAString(null);
    }


}