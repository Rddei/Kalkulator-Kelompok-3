package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KalkulatorTestTambah {
    private final Operasi operator = new Operasi();

    @Test
    void testTambah() {
        assertEquals(15.0, operator.tambah(10, 5));
        assertEquals(-5.0, operator.tambah(-10, 5));
    }
}