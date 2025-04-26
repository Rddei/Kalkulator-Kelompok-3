package com.example.kalkulatorkel3;

public class Kalkulator {
    public double tambah(double a, double b) {
        return a + b;
    }

    public double kurang(double a, double b) {
        return a - b;
    }

    public double kali(double a, double b) {
        return a * b;
    }

    public double bagi(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }

    public String komputasi(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return String.valueOf(tambah(a, b));
            case "-":
                return String.valueOf(kurang(a, b));
            case "*":
                return String.valueOf(kali(a, b));
            case "/":
                try {
                    return String.valueOf(bagi(a, b));
                } catch (IllegalArgumentException e) {
                    return "Error: " + e.getMessage();
                }
            default:
                return "Error: Operator tidak valid (+, -, *, /)";
        }
    }
}
