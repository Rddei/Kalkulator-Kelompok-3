package com.example.kalkulatorkel3;

public class ValidatorOperator {
    private static final AsalPerin perinter = new AsalPerin();
    
    /**
     * Memeriksa apakah operator yang dimasukkan valid (+, -, *, /)
     * @param operator string yang akan divalidasi
     * @return true jika operator valid, false jika tidak
     */
    public static boolean isValidOperator(String operator) {
        if (operator == null || operator.trim().isEmpty()) {
            perinter.perin("Operator tidak boleh kosong. Silakan masukkan operator (+, -, *, /):");
            return false;
        }
        
        String trimmedOperator = operator.trim();
        if (trimmedOperator.equals("+") || 
            trimmedOperator.equals("-") || 
            trimmedOperator.equals("*") || 
            trimmedOperator.equals("/")) {
            return true;
        } else {
            perinter.perin("Operator tidak valid! Gunakan salah satu dari: +, -, *, /");
            return false;
        }
    }
}