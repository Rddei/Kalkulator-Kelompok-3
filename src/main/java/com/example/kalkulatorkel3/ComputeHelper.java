package com.example.kalkulatorkel3;

public class ComputeHelper {
    public static String computeWithPrecedence(double a, String operator1, double b, String operator2, double c, Kalkulator kalkulator) {
        String tempResultStr;
        double tempResult; // 1

        if ((operator2.equals("*") || operator2.equals("/")) && (operator1.equals("+") || operator1.equals("-"))) { // 2
            tempResultStr = kalkulator.komputasi(b, c, operator2); // 3
            if (tempResultStr.startsWith("Error")) { // 4
                return tempResultStr; // 5
            }

            try { // 6
                tempResult = Double.parseDouble(tempResultStr); // 7
            } catch (NumberFormatException e) { 
                return "Error: Hasil antara angka kedua dan ketiga tidak valid!"; // 8
            }

            return kalkulator.komputasi(a, tempResult, operator1); // 9
        } else {
            tempResultStr = kalkulator.komputasi(a, b, operator1); // 10
            if (tempResultStr.startsWith("Error")) { // 11
                return tempResultStr; // 12
            }

            try { // 13
                tempResult = Double.parseDouble(tempResultStr); // 14
            } catch (NumberFormatException e) { 
                return "Error: Hasil antara angka pertama dan kedua tidak valid!"; // 15
            }

            return kalkulator.komputasi(tempResult, c, operator2); // 16
        }
    }
}