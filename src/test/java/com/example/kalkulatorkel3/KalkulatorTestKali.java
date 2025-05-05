package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KalkulatorTestKali {
    private final Operasi operator = new Operasi();

    @Test
    void testKaliDuaBilanganPositif() {
        assertEquals(1.0, operator.kali(1.0, 1.0));
    }

    @Test
    void testKaliPositifNegatif() {
        assertEquals(-3.0, operator.kali(1.0, -3.0));
    }

    @Test
    void testKaliNegatifNegatif() {
        assertEquals(24.0, operator.kali(-4.0, -6.0));
    }

    @Test
    void testKaliPositifDenganKarakter() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.kali(2.0, "A"));
        assertEquals("Input harus berupa angka", e.getMessage());
    }

    @Test
    void testKaliNegatifDenganKarakter() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.kali(-2.0, "A"));
        assertEquals("Input harus berupa angka", e.getMessage());
    }

    @Test
    void testKaliKarakterDenganPositif() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.kali("A", 3.0));
        assertEquals("Input harus berupa angka", e.getMessage());
    }

    @Test
    void testKaliKarakterDenganNegatif() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.kali("A", -3.0));
        assertEquals("Input harus berupa angka", e.getMessage());
    }
}
