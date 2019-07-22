package com.stackroute.pe4;

public class NameMatcher {
    public boolean matchingString(String input) {
//        using regular expression
        if (input.matches(".*Harry.*")) {
            return true;
        } else
            return false;
    }
}
