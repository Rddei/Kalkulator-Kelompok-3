package com.example.kalkulatorkel3;

public class Operasi {
    public double tambah(double a, double b) {
        return a + b; // 1
    }

    public double kurang(double a, double b) {
        return a - b; // 1
    }

    public double kali(double a, double b) {
        return a * b; // 1
    }

    public double bagi(double a, double b) {
        if (b == 0) { // 1
            throw new IllegalArgumentException("Pembagi tidak boleh nol"); // 2
        }
        return a / b; // 3
    }
}
