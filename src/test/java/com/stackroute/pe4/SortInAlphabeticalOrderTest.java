package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortInAlphabeticalOrderTest {
    SortInAlphabeticalOrder sortInAlphabeticalOrder;

    /* This methods runs, before running any one of the test case .
               It is used to initialize the required variables
        */
    @Before
    public  void setup()
    {
//        arrange
        sortInAlphabeticalOrder= new SortInAlphabeticalOrder();
    }

    /* This method runs, after running all the test cases
                  It is used to clear the initialized variables
           */
    @After
    public void teardown()
    {
        sortInAlphabeticalOrder= null;
    }

    @Test
    public void givenInputStringShouldReturnAStringWithSortedWordsInAlphabeticalOrder()
    {
//        act
        String input= "our world is beautiful";
        String actualResult=sortInAlphabeticalOrder.sortWordInAlphabeticalOrder(input);
//        assert
        String expectedResult= "beautiful is our world";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenInputStringWithUpperCaseShouldReturnAStringWithSortedWordsInAlphabeticalOrder()
    {
//        act
        String input= "Our World Is Beautiful";
        String actualResult=sortInAlphabeticalOrder.sortWordInAlphabeticalOrder(input);
//        assert
        String expectedResult= "Beautiful Is Our World";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenInputStringWithNumbersShouldReturnAStringWithNumbersFirstAndSortedWordsInAlphabeticalOrder()
    {
//        act
        String input= "Our World Is 567 Beautiful";
        String actualResult=sortInAlphabeticalOrder.sortWordInAlphabeticalOrder(input);
//        assert
        String expectedResult= "567 Beautiful Is Our World";
        assertEquals(expectedResult,actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldReturnNullPointerException()
    {
        this.sortInAlphabeticalOrder.sortWordInAlphabeticalOrder(null);
    }

}