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

    public double bagi(Object a, Object b) {
        // Validasi input
        if (!(a instanceof Number)) {
            throw new IllegalArgumentException("Input harus berupa angka");
        }
        if (!(b instanceof Number)) {
            throw new IllegalArgumentException("Input harus berupa angka");
        }
        
        double numA = ((Number) a).doubleValue();
        double numB = ((Number) b).doubleValue();
        
        // Validasi pembagi tidak boleh nol
        if (numB == 0) { // 1
            throw new IllegalArgumentException("Pembagi tidak boleh nol"); // 2
        }
        return numA / numB; // 3
    }
    
    // Overloaded method untuk kemudahan penggunaan dengan tipe double
    public double bagi(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }
}