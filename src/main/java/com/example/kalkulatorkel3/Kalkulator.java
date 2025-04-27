package com.example.kalkulatorkel3;

public class Kalkulator {
    private OperasiTambah operasiTambah = new OperasiTambah();
    private OperasiKurang operasiKurang = new OperasiKurang();
    private OperasiKali operasiKali = new OperasiKali();
    private OperasiBagi operasiBagi = new OperasiBagi(); // 1

    public String komputasi(double a, double b, String operator) {
        switch (operator) { // 2
            case "+": // 3
                return String.valueOf(operasiTambah.tambah(a, b)); // 4
            case "-": // 5
                return String.valueOf(operasiKurang.kurang(a, b)); // 6
            case "*": // 7
                return String.valueOf(operasiKali.kali(a, b)); // 8
            case "/": // 9
                try { // 10
                    return String.valueOf(operasiBagi.bagi(a, b)); // 11
                } catch (IllegalArgumentException e) {
                    return "Error: " + e.getMessage(); // 12
                }
            default: // 13
                return "Error: Operator tidak valid (+, -, *, /)"; // 14
        }
    }
}
