package com.example.wordcounter2.util;

public class Calculator {
    public static int getCharsCount(String str){
        return str.length();}

    public static int getWordsCount(String str){
        if(str.length() == 0)
            return 0;

        int count =0;
        for(int i=0;i< str.length();i++) {

            if(str.charAt(i) == ' ')
                continue;

            if (i > 0 && str.charAt(i - 1) == ' ') {
                count++;
            } else if (i == 0 && str.charAt(i) != ' ') {
                count++;
            }
        }

        return count;
    }
}
