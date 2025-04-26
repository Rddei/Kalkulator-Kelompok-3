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
        // Validasi: pastikan input adalah angka (sudah dijamin oleh tipe double)
        // Validasi: rentang angka -32,768 hingga 32,767
        if (a < -32768 || a > 32767 || b < -32768 || b > 32767) {
            return "Error: Angka harus dalam rentang -32,768 hingga 32,767";
        }

        // Validasi: operator yang valid
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