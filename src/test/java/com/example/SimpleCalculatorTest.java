package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SimpleCalculatorTest {
    
    private SimpleCalculator calculator = new SimpleCalculator();
    
    @Test
    public void testAdd() {
        Assertions.assertEquals(5, calculator.add(2, 3));
        Assertions.assertEquals(0, calculator.add(-1, 1));
        Assertions.assertEquals(-5, calculator.add(-2, -3));
    }
    
    @Test
    public void testSubtract() {
        Assertions.assertEquals(1, calculator.subtract(3, 2));
        Assertions.assertEquals(-1, calculator.subtract(2, 3));
        Assertions.assertEquals(0, calculator.subtract(5, 5));
    }
    
    @Test
    public void testMultiply() {
        Assertions.assertEquals(6, calculator.multiply(2, 3));
        Assertions.assertEquals(0, calculator.multiply(0, 5));
        Assertions.assertEquals(-6, calculator.multiply(-2, 3));
    }
    
    @Test
    public void testDivide() {
        Assertions.assertEquals(2.0, calculator.divide(6, 3), 0.001);
        Assertions.assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }
    
    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
    }
}

