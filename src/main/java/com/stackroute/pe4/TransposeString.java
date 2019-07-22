package com.stackroute.pe4;


public class TransposeString {
    public String transposeWordsOfAString(String input)
    {
//splits the input string into a string array of words
        String[] arrayOfwords= input.split(" ");
        StringBuilder transposeString=new StringBuilder();
        //reverses each element of the string array
        for (String words:arrayOfwords)
        {
            String reverseWords= new StringBuilder(words).reverse().toString();
            transposeString.append(reverseWords+" ");
        }
        //returns the reversed string
        return transposeString.toString().trim();
    }
}
