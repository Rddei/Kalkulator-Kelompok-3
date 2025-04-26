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
    void testKomputasiValid() {
        // Pengujian dengan 2 operand dan operator valid
        assertEquals("15.0", kalkulator.komputasi(10, 5, "+"), "Penjumlahan 10 + 5 harus menghasilkan 15.0");
        assertEquals("5.0", kalkulator.komputasi(10, 5, "-"), "Pengurangan 10 - 5 harus menghasilkan 5.0");
        assertEquals("50.0", kalkulator.komputasi(10, 5, "*"), "Perkalian 10 * 5 harus menghasilkan 50.0");
        assertEquals("2.0", kalkulator.komputasi(10, 5, "/"), "Pembagian 10 / 5 harus menghasilkan 2.0");
    }

    @Test
    void testKomputasiOperatorHuruf() {
        // Pengujian dengan operator berupa huruf (mensimulasikan input tidak valid seperti huruf)
        assertEquals("Error: Operator tidak valid (+, -, *, /)",
                kalkulator.komputasi(10, 5, "x"),
                "Operator 'x' harus menghasilkan pesan error");
        assertEquals("Error: Operator tidak valid (+, -, *, /)",
                kalkulator.komputasi(10, 5, "%"),
                "Operator '%' harus menghasilkan pesan error");
        assertEquals("Error: Operator tidak valid (+, -, *, /)",
                kalkulator.komputasi(10, 5, "abc"),
                "Operator 'abc' harus menghasilkan pesan error");
    }

    @Test
    void testKomputasiPembagiNol() {
        // Pengujian dengan 2 operand, salah satunya pembagi nol
        assertEquals("Error: Pembagi tidak boleh nol",
                kalkulator.komputasi(10, 0, "/"),
                "Pembagian dengan nol harus menghasilkan pesan error");
    }
}