package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addNumbers() {
        MyClass mc = new MyClass();
        int result = mc.addNumbers(3,5);
        assertEquals(8, result);
    }

    @Test
    void factorialTest(){
        MyClass mc = new MyClass();
        int result = mc.factorial(5);
        assertNotEquals(123, result);
    }

    @Test
    void isAdult(){
        Person p1 = new Person();
        boolean age = p1.isAdult(23);
        assertTrue(age);
    }

    @Test
    void isChild(){
        Person p2 = new Person();
        boolean age = p2.isAdult(7);
        assertFalse(age);
    }





}