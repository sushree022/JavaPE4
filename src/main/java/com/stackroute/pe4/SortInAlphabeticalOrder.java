package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInAlphabeticalOrder {
    public String sortWordInAlphabeticalOrder(String input)
    {

//        splitting String input based on space
        String[] arrayOfwords= input.split(" ");
        List<String> listOfWords= new ArrayList<String>();

//        logic for sorting
        for(int i=0;i<arrayOfwords.length; i++) {
            listOfWords.add(arrayOfwords[i]);
        }
        Collections.sort(listOfWords);
        StringBuilder stringBuilder= new StringBuilder();
        for (String string: listOfWords)
        {
            stringBuilder.append(string);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
