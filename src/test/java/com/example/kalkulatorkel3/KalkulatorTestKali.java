package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KalkulatorTestKali {
    private final Operasi operator = new Operasi();

    @Test
    void testKali() {
        assertEquals(50.0, operator.kali(10, 5));
        assertEquals(-50.0, operator.kali(-10, 5));
    }
}