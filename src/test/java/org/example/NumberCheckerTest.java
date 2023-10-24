package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @ValueSource(ints = {2,7,11,13})
    void isPrime(int num) {
        NumberChecker num1 = new NumberChecker();
        boolean result = num1.isPrime(num);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "squareNumbers.csv", numLinesToSkip = 1)
    void checkIfSquare(int num, int expected) {
        NumberChecker num1 = new NumberChecker();
        int result = num1.square(num);
        assertEquals(num, result);
    }


}