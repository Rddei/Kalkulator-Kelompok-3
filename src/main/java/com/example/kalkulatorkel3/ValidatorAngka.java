package com.example.kalkulatorkel3;

public class ValidatorAngka {
    private static final AsalPerin perinter = new AsalPerin();

    private static final double MIN_RANGE = -32768; // 1
    private static final double MAX_RANGE = 32767;

    public static boolean isValidDouble(String input) { 
        if (input == null || input.trim().isEmpty()) {
            perinter.perin("Input tidak boleh kosong. Silakan masukkan angka:");
            return false;
        }
        
        try { // 2
            double val = Double.parseDouble(input); // 3
            if (val >= MIN_RANGE && val <= MAX_RANGE){ // 4
                return true; // 5
            } else {
                perinter.perin("Input salah, Masukkan angka dalam rentang " + MIN_RANGE + " sampai " + MAX_RANGE + ":"); // 6
                return false;
            }
        } catch (NumberFormatException e) { 
            perinter.perin("Input salah, Masukkan angka yang valid:"); // 7
            return false; // bukan angka
        }
    }
    
    public static double parseDouble(String input) {
        return Double.parseDouble(input); // dipanggil kalau sudah valid // 1
    }
}