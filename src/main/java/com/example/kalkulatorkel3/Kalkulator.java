package com.example.kalkulatorkel3;

public class Kalkulator {
    private Operasi operasi = new Operasi(); // 1

    public String komputasi(double a, double b, String operator) {
        switch (operator) { // 2
            case "+": // 3
                return String.valueOf(operasi.tambah(a, b)); // 4
            case "-": // 5
                return String.valueOf(operasi.kurang(a, b)); // 6
            case "*": // 7
                return String.valueOf(operasi.kali(a, b)); // 8
            case "/": // 9
                try { // 10
                    return String.valueOf(operasi.bagi(a, b)); // 11
                } catch (IllegalArgumentException e) {
                    return "Error: " + e.getMessage(); // 12
                }
            default: // 13
                return "Error: Operator tidak valid (+, -, *, /)"; // 14
        }
    }
}
