package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KalkulatorTestBagi {
    private final Operasi operator = new Operasi();

    @Test
    void testBagi() {
        assertEquals(2.0, operator.bagi(10, 5));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> operator.bagi(10, 0));
        assertEquals("Pembagi tidak boleh nol", exception.getMessage());
    }
}