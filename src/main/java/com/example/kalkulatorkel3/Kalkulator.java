package com.example.kalkulatorkel3;

public class Kalkulator {
    private OperasiTambah operasiTambah = new OperasiTambah();
    private OperasiKurang operasiKurang = new OperasiKurang();
    private OperasiKali operasiKali = new OperasiKali();
    private OperasiBagi operasiBagi = new OperasiBagi();

    public String komputasi(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return String.valueOf(operasiTambah.tambah(a, b));
            case "-":
                return String.valueOf(operasiKurang.kurang(a, b));
            case "*":
                return String.valueOf(operasiKali.kali(a, b));
            case "/":
                try {
                    return String.valueOf(operasiBagi.bagi(a, b));
                } catch (IllegalArgumentException e) {
                    return "Error: " + e.getMessage();
                }
            default:
                return "Error: Operator tidak valid (+, -, *, /)";
        }
    }
}
