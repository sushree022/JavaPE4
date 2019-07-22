package com.stackroute.pe4;

public class ReplacementOfCharacter {
    public String replaceCharacter(String input)
    {
//        replace "d" with "f" in the input string
        String result1= input.replaceAll("d", "f");
//        replace "l" with "t" in the previously replaced string
        String resultFinal= result1.replaceAll("l","t");
        return resultFinal;
    }
}
