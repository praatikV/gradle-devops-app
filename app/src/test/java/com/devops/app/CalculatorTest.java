package com.devops.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(6, calc.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(42, calc.multiply(6, 7));
    }

    @Test
    void testDivide() {
        assertEquals(5, calc.divide(20, 4));
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
