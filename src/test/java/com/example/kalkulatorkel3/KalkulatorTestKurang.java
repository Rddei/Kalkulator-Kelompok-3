package com.example.kalkulatorkel3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KalkulatorTestKurang {
    private final OperasiKurang operator = new OperasiKurang();

    @Test
    void testKurang() {
        assertEquals(5.0, operator.kurang(10, 5));
        assertEquals(-15.0, operator.kurang(-10, 5));
    }
}