package com.example.kalkulatorkel3;

public class OperasiBagi {
    public double bagi(double a, double b) {
        if (b == 0) { // 1
            throw new IllegalArgumentException("Pembagi tidak boleh nol"); // 2
        }
        return a / b; // 3
    }   
}
