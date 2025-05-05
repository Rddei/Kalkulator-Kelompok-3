package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AsalPerinTest {

    @Test
    void testPerin() {
        // Save the original System.out
        PrintStream originalOut = System.out;
        
        try {
            // Setup our own output stream to capture output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            
            // Create instance and test the method
            AsalPerin perinter = new AsalPerin();
            String testString = "Test Message";
            String result = perinter.perin(testString);
            
            // Verify that the method printed the string
            assertEquals(testString + System.lineSeparator(), outContent.toString());
            
            // Verify that the method returned the same string
            assertEquals(testString, result);
            
        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }
}