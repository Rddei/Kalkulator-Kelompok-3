package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatorOperatorTest {

    @Test
    void testIsValidOperatorWithValidInput() {
        assertTrue(ValidatorOperator.isValidOperator("+"));
        assertTrue(ValidatorOperator.isValidOperator("-"));
        assertTrue(ValidatorOperator.isValidOperator("*"));
        assertTrue(ValidatorOperator.isValidOperator("/"));
        assertTrue(ValidatorOperator.isValidOperator(" + ")); // Test with spaces
    }

    @Test
    void testIsValidOperatorWithInvalidInput() {
        assertFalse(ValidatorOperator.isValidOperator("a"));
        assertFalse(ValidatorOperator.isValidOperator(""));
        assertFalse(ValidatorOperator.isValidOperator("   "));
        assertFalse(ValidatorOperator.isValidOperator("%"));
        assertFalse(ValidatorOperator.isValidOperator("++"));
        assertFalse(ValidatorOperator.isValidOperator("+-"));
    }
}