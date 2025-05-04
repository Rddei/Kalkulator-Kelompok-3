package com.example.kalkulatorkel3;

public class ValidatorAngka {
    private static final AsalPerin perinter = new AsalPerin();

    private static final double MIN_RANGE = -32768; // 1
    private static final double MAX_RANGE = 32767;

    public static boolean isValidDouble(String input) { 
        try { // 2
            double val = Double.parseDouble(input); // 3
            if (val >= MIN_RANGE && val <= MAX_RANGE){ // 4
                return true; // 5
            } else {
                perinter.perin("Input salah, Masukkan angka dalam rentang -32768 sampai 32767:"); // 6
                return false;
            }
        } catch (NumberFormatException e) { 
            perinter.perin("Input salah, Masukkan angka:"); // 7
            return false; // bukan angka
        }
    }
    
    public static double parseDouble(String input) {
        return Double.parseDouble(input); // dipanggil kalau sudah valid // 1
    }
}
