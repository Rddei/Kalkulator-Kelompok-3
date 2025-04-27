package com.example.kalkulatorkel3;

public class ComputeHelper {
    public static String computeWithPrecedence(double a, String operator1, double b, String operator2, double c, Kalkulator kalkulator) {
        String tempResultStr;
        double tempResult;

        if ((operator2.equals("*") || operator2.equals("/")) && (operator1.equals("+") || operator1.equals("-"))) {
            tempResultStr = kalkulator.komputasi(b, c, operator2);
            if (tempResultStr.startsWith("Error")) {
                return tempResultStr;
            }

            try {
                tempResult = Double.parseDouble(tempResultStr);
            } catch (NumberFormatException e) {
                return "Error: Hasil antara angka kedua dan ketiga tidak valid!";
            }

            return kalkulator.komputasi(a, tempResult, operator1);
        } else {
            tempResultStr = kalkulator.komputasi(a, b, operator1);
            if (tempResultStr.startsWith("Error")) {
                return tempResultStr;
            }

            try {
                tempResult = Double.parseDouble(tempResultStr);
            } catch (NumberFormatException e) {
                return "Error: Hasil antara angka pertama dan kedua tidak valid!";
            }

            return kalkulator.komputasi(tempResult, c, operator2);
        }
    }
}
