package com.stackroute.pe4;

public class OccurrenceOfCharacter
{
    public int noOfOccurrenceOfCharacter(String input)
    {
//        logic to get number of occurance of a
        int lengthOfStringWithA = input.length() - input.replaceAll("a", "").length();
        return lengthOfStringWithA;
    }
}
