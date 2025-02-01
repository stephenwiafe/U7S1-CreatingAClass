package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 18
    @Test
    public void oneTeenTest01() {

        // Given
        int a = 13;
        int b = 99;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneTeenTest02() {

        // Given
        int a = 21;
        int b = 19;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneTeenTest03() {

        // Given
        int a = 13;
        int b = 13;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 19
    @Test
    public void beginWithOzTest01() {

        // Given
        String str = "ozymandias";

        // When
        String expected = "oz";
        String actual = AlgoChallenge.beginWithOz(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithOzTest02() {

        // Given
        String str = "bzoo";

        // When
        String expected = "z";
        String actual = AlgoChallenge.beginWithOz(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithOzTest03() {

        // Given
        String str = "oxx";

        // When
        String expected = "o";
        String actual = AlgoChallenge.beginWithOz(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}