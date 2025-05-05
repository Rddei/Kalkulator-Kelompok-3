package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatorAngkaTest {

    @Test
    void testIsValidDoubleWithValidInput() {
        assertTrue(ValidatorAngka.isValidDouble("123"));
        assertTrue(ValidatorAngka.isValidDouble("0"));
        assertTrue(ValidatorAngka.isValidDouble("-123"));
        assertTrue(ValidatorAngka.isValidDouble("123.456"));
        assertTrue(ValidatorAngka.isValidDouble("32767")); // Maximum value
        assertTrue(ValidatorAngka.isValidDouble("-32768")); // Minimum value
    }

    @Test
    void testIsValidDoubleWithInvalidInput() {
        assertFalse(ValidatorAngka.isValidDouble("abc"));
        assertFalse(ValidatorAngka.isValidDouble(""));
        assertFalse(ValidatorAngka.isValidDouble("   "));
        assertFalse(ValidatorAngka.isValidDouble("123abc"));
        assertFalse(ValidatorAngka.isValidDouble("32768")); // Greater than maximum
        assertFalse(ValidatorAngka.isValidDouble("-32769")); // Less than minimum
    }

    @Test
    void testParseDouble() {
        assertEquals(123.0, ValidatorAngka.parseDouble("123"));
        assertEquals(0.0, ValidatorAngka.parseDouble("0"));
        assertEquals(-123.0, ValidatorAngka.parseDouble("-123"));
        assertEquals(123.456, ValidatorAngka.parseDouble("123.456"));
    }
}