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
        String input= "world is beautiful";
        String actualResult=sortInAlphabeticalOrder.sortWordInAlphabeticalOrder(input);
//        assert
        String expectedResult= "dlorw is abefiltuu";
        assertEquals(expectedResult,actualResult);

    }
    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException()
    {
        this.sortInAlphabeticalOrder.sortWordInAlphabeticalOrder(null);
    }

}