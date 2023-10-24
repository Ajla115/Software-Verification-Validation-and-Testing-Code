package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
        int actual = num1.square(num);
        assertEquals(expected, actual);
    }
    //here for the result, we are writing the result of the operation and
    //and for the expected, we are taking the value from the file.

    @ParameterizedTest
    @CsvFileSource(resources = "fibonacci.csv", numLinesToSkip = 1)
    void checkIfFibonacci(int num, int expected){
        NumberChecker num1 = new NumberChecker();
        int actual = num1.fibonacci(num);
        assertEquals(expected, actual);
    }



}