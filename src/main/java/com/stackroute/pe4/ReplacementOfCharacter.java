package com.stackroute.pe4;

public class ReplacementOfCharacter {
    public String replaceCharacter(String input)
    {
        String result1= input.replaceAll("d", "f");
        String resultFinal= result1.replaceAll("l","t");
        return resultFinal;
    }
}
