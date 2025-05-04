package com.example.kalkulatorkel3;

public class ValidatorAngka {
    private static final AsalPerin perinter = new AsalPerin();

    private static final double MIN_RANGE = -32768;
    private static final double MAX_RANGE = 32767;

    public static boolean isValidDouble(String input) {
        try {
            double val = Double.parseDouble(input);
            if (val >= MIN_RANGE && val <= MAX_RANGE){
                return true;
            } else {
                perinter.perin("Input salah, Masukkan angka dalam rentang -32768 sampai 32767:");
                return false;
            }
        } catch (NumberFormatException e) {
            perinter.perin("Input salah, Masukkan angka:");
            return false; // bukan angka
        }
    }
    
    public static double parseDouble(String input) {
        return Double.parseDouble(input); // dipanggil kalau sudah valid
    }
}
