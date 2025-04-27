package com.example.kalkulatorkel3;

public class OperasiBagi {
    public double bagi(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }
}
