package com.example.kalkulatorkel3;

public class ComputeHelper {
    public static String computeWithPrecedence(double a, String operator1, double b, String operator2, double c, Kalkulator kalkulator) {
        String tempResultStr;
        double tempResult; // 1

        // Memastikan precedence operasi: * dan / didahulukan dibanding + dan -
        if ((operator2.equals("*") || operator2.equals("/")) && (operator1.equals("+") || operator1.equals("-"))) { // 2
            // Hitung b operator2 c dulu
            tempResultStr = kalkulator.komputasi(b, c, operator2); // 3
            if (tempResultStr.startsWith("Error")) { // 4
                return tempResultStr; // 5
            }

            try { // 6
                tempResult = Double.parseDouble(tempResultStr); // 7
            } catch (NumberFormatException e) { 
                return "Error: Hasil antara angka kedua dan ketiga tidak valid!"; // 8
            }

            // Kemudian hitung a operator1 tempResult
            return kalkulator.komputasi(a, tempResult, operator1); // 9
        } else {
            // Hitung dari kiri ke kanan: a operator1 b dulu
            tempResultStr = kalkulator.komputasi(a, b, operator1); // 10
            if (tempResultStr.startsWith("Error")) { // 11
                return tempResultStr; // 12
            }

            try { // 13
                tempResult = Double.parseDouble(tempResultStr); // 14
            } catch (NumberFormatException e) { 
                return "Error: Hasil antara angka pertama dan kedua tidak valid!"; // 15
            }

            // Kemudian hitung tempResult operator2 c
            return kalkulator.komputasi(tempResult, c, operator2); // 16
        }
    }
}