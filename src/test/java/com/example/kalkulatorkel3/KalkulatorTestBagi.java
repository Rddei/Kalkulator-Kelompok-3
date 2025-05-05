package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KalkulatorTestBagi {
    private final Operasi operator = new Operasi();

    @Test
    void testBagiDuaBilanganPositif() {
        assertEquals(1.0, operator.bagi(1.0, 1.0));
    }

    @Test
    void testBagiPositifNegatif() {
        assertEquals(-1.0, operator.bagi(3.0, -3.0));
    }

    @Test
    void testBagiNegatifNegatif() {
        assertEquals(1.0, operator.bagi(-6.0, -6.0));
    }

    @Test
    void testBagiPositifDenganKarakter() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.bagi(2.0, "A"));
        assertEquals("Input harus berupa angka", e.getMessage());
    }

    @Test
    void testBagiNegatifDenganKarakter() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.bagi(-2.0, "A"));
        assertEquals("Input harus berupa angka", e.getMessage());
    }

    @Test
    void testBagiKarakterDenganPositif() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.bagi("A", 3.0));
        assertEquals("Input harus berupa angka", e.getMessage());
    }

    @Test
    void testBagiKarakterDenganNegatif() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.bagi("A", -3.0));
        assertEquals("Input harus berupa angka", e.getMessage());
    }

    @Test
    void testBagiKarakterDenganNol() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> operator.bagi("A", 0.0));
        assertEquals("Input harus berupa angka", e.getMessage());
    }

}