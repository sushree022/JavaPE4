package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceOfWord {
    public String occurrenceOfParticularWord(String input, String repeatWord)
    {
        //compiles the regex into a pattern
        Pattern pattern= Pattern.compile(repeatWord);
        Matcher matcher= pattern.matcher(input);
        String result="";
        while (matcher.find())
        {
            result= result.concat("Found at:"+ matcher.start()+"-"+ matcher.end()).concat("\n");
        }
        return result.trim();
    }
}
