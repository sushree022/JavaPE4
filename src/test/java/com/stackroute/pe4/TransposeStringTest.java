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
    public void givenInputStringShouldReturnAStringWithWordsInReverse()
    {
//        act
        String input= "a quick brown fox jumps over the lazy dog";
        String actualResult=transposeString.transposeWordsOfAString(input);
//        assert
        String expectedResult= "a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(expectedResult,actualResult);
    }


    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldReturnNullPointerException()
    {
        this.transposeString.transposeWordsOfAString(null);
    }
}