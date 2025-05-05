package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputeHelperTest {
    private final Kalkulator kalkulator = new Kalkulator();

    @Test
    void testComputeWithPrecedenceMulDiv() {
        // Test precedence (*/): a + b * c, should compute (b * c) first, then add a
        assertEquals("25.0", ComputeHelper.computeWithPrecedence(5, "+", 4, "*", 5, kalkulator));
        
        // Test precedence (*/): a - b / c, should compute (b / c) first, then subtract from a
        assertEquals("8.0", ComputeHelper.computeWithPrecedence(10, "-", 6, "/", 3, kalkulator));
    }

    @Test
    void testComputeWithPrecedenceAddSub() {
        // Test left to right (no precedence): a * b + c, should compute (a * b) first, then add c
        assertEquals("23.0", ComputeHelper.computeWithPrecedence(4, "*", 5, "+", 3, kalkulator));
        
        // Test left to right (no precedence): a / b - c, should compute (a / b) first, then subtract c
        assertEquals("-1.0", ComputeHelper.computeWithPrecedence(10, "/", 5, "-", 3, kalkulator));
    }

    @Test
    void testComputeWithErrors() {
        // Test error handling: division by zero
        String result = ComputeHelper.computeWithPrecedence(5, "+", 10, "/", 0, kalkulator);
        assertTrue(result.startsWith("Error"));
        
        // Test error propagation from first calculation
        result = ComputeHelper.computeWithPrecedence(5, "/", 0, "+", 3, kalkulator);
        assertTrue(result.startsWith("Error"));
    }
}