package com.stackroute.pe4;


public class TransposeString {
    public String transposeWordsOfAString(String input)
    {
        String[] arrayOfwords= input.split(" ");
        StringBuilder transposeString=new StringBuilder();
        for (String words:arrayOfwords)
        {
            String reverseWords= new StringBuilder(words).reverse().toString();
            transposeString.append(reverseWords+" ");
        }
        return transposeString.toString().trim();
    }
}
