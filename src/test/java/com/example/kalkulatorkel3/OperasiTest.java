package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperasiTest {
    private final Operasi operasi = new Operasi();

    @Test
    void testTambah() {
        assertEquals(15.0, operasi.tambah(10, 5));
        assertEquals(-5.0, operasi.tambah(-10, 5));
        assertEquals(0.0, operasi.tambah(0, 0));
        assertEquals(5.5, operasi.tambah(2.5, 3.0));
        assertEquals(-7.0, operasi.tambah(-5, -2));
    }

    @Test
    void testKurang() {
        assertEquals(5.0, operasi.kurang(10, 5));
        assertEquals(-15.0, operasi.kurang(-10, 5));
        assertEquals(0.0, operasi.kurang(0, 0));
        assertEquals(-0.5, operasi.kurang(2.5, 3.0));
        assertEquals(-3.0, operasi.kurang(-5, -2));
    }

    @Test
    void testKali() {
        assertEquals(50.0, operasi.kali(10, 5));
        assertEquals(-50.0, operasi.kali(-10, 5));
        assertEquals(0.0, operasi.kali(0, 5));
        assertEquals(7.5, operasi.kali(2.5, 3.0));
        assertEquals(10.0, operasi.kali(-5, -2));
    }

    @Test
    void testBagi() {
        assertEquals(2.0, operasi.bagi(10, 5));
        assertEquals(-2.0, operasi.bagi(-10, 5));
        assertEquals(0.0, operasi.bagi(0, 5));
        assertEquals(0.5, operasi.bagi(1.5, 3.0));
        assertEquals(2.5, operasi.bagi(-5, -2));
        
        // Test pembagian dengan nol
        Exception exception = assertThrows(IllegalArgumentException.class, () -> operasi.bagi(10, 0));
        assertEquals("Pembagi tidak boleh nol", exception.getMessage());
    }
}