package com.example.wordcounter2;

import com.example.wordcounter2.util.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsClassUnitTest {

    //Chars

    @Test
    public void Given_NullString_When_getCharsCountIsCalled_Then_NullPointerExceptionIsThrown(){
        final String givenString = null;

        final int expectedResult = 0;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithPunctuation_When_getCharsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "Is it true?";

        final int expectedResult = 9;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_EmptyString_When_getCharsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_String_When_getCharsCountIsCalled_Then_ReturnedNumberOfCharsInString(){
        final String givenString = "Hello";

        final int expectedResult = 5;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringOfMultipleEmptySpaces_When_getCharsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "   ";

        final int expectedResult = 0;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void Given_StringWithMultipleEmptySpaces_When_getCharsCountIsCalled_Then_ReturnedNumberOfNonWhitespaceCharacters(){
        final String givenString = "Hello    world  ";

        final int expectedResult = 10;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    //Words

    @Test (expected = NullPointerException.class)
    public void Given_NullString_When_getWordsCountIsCalled_Then_NullPointerExceptionIsThrown(){
        Calculator.getWordsCount(null);
    }

    @Test
    public void Given_WordsWithPunctuation_When_getWordsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "Is it true?";

        final int expectedResult = 3;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_EmptyString_When_getWordsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithoutSpaces_When_getWordsCountIsCalled_Then_ReturnedNumberOfCharsInString(){
        final String givenString = "Hello";

        final int expectedResult = 1;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_WordOfMultipleEmptySpaces_When_getWordsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "     ";

        final int expectedResult = 0;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void Given_WordsWithSeveralSpaces_When_getWordsCountIsCalled_Then_ReturnedNumberOfNonWhitespaceCharacters(){
        final String givenString = "Hello    world  ";

        final int expectedResult = 2;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
}