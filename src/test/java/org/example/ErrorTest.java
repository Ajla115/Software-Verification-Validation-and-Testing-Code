package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ErrorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Order(3)
    @Test
    void typeOfError() {
        Error error1 = new Error("Fault in the code", "MyPresentation.pttx", 7, 4, "24-10-2023, 11:33");
        String result = error1.typeOfError(4);
        assertEquals("Warnings", result);
    }

    @Order(4)
    @Test
    void typeOfErrorNegative() {
        Error error1 = new Error("Fault in the code", "MyPresentation.pttx", 7, 2, "24-10-2023, 11:33");
        String result = error1.typeOfError(2);
        assertNotEquals("Notice", result);
    }


    @Order(1)
    @Test
    void checkIfUrgent() {
        Error error1 = new Error("Fault in the code", "MyPresentation.pttx", 7, 6, "24-10-2023, 11:33");
        boolean urgentLevel = error1.checkIfUrgent(7);
        assertTrue(urgentLevel);
    }

    @Order(2)
    @Test
    void checkIfUrgentNegative() {
        Error error1 = new Error("Fault in the code", "MyPresentation.pttx", 7, 3, "24-10-2023, 11:33");
        boolean urgentLevel2 = error1.checkIfUrgent(3);
        assertFalse(urgentLevel2);
    }
}