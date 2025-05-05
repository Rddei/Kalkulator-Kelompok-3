package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class InputHelperTest {

    @Test
    void testGetRawInput() {
        // Setup input stream with test data
        String testInput = "test input";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(testInput.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        // Test the method
        String result = InputHelper.getRawInput(scanner);
        
        // Verify result
        assertEquals(testInput, result);
        
        // Clean up
        scanner.close();
    }
}