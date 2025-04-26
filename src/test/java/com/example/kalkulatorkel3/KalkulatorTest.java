package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KalkulatorTest {
    private final Kalkulator kalkulator = new Kalkulator();

    @Test
    void testTambah() {
        assertEquals(15.0, kalkulator.tambah(10, 5));
        assertEquals(-5.0, kalkulator.tambah(-10, 5));
    }

    @Test
    void testKurang() {
        assertEquals(5.0, kalkulator.kurang(10, 5));
        assertEquals(-15.0, kalkulator.kurang(-10, 5));
    }

    @Test
    void testKali() {
        assertEquals(50.0, kalkulator.kali(10, 5));
        assertEquals(-50.0, kalkulator.kali(-10, 5));
    }

    @Test
    void testBagi() {
        assertEquals(2.0, kalkulator.bagi(10, 5));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> kalkulator.bagi(10, 0));
        assertEquals("Pembagi tidak boleh nol", exception.getMessage());
    }

    @Test
    void testKomputasi() {
        // Test case valid
        assertEquals("15.0", kalkulator.komputasi(10, 5, "+"));
        assertEquals("5.0", kalkulator.komputasi(10, 5, "-"));
        assertEquals("50.0", kalkulator.komputasi(10, 5, "*"));
        assertEquals("2.0", kalkulator.komputasi(10, 5, "/"));

        // Test case invalid
        assertEquals("Error: Pembagi tidak boleh nol", kalkulator.komputasi(10, 0, "/"));
        assertEquals("Error: Angka harus dalam rentang -32,768 hingga 32,767", kalkulator.komputasi(40000, 5, "+"));
        assertEquals("Error: Operator tidak valid (+, -, *, /)", kalkulator.komputasi(10, 5, "%"));
    }
}