package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    private static final double MIN_RANGE = -32768;
    private static final double MAX_RANGE = 32767;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        // Input dan validasi angka pertama
        double a = getValidOperand(scanner, "Masukkan angka pertama: ");

        // Input operator pertama
        System.out.println("Masukkan operator pertama (+, -, *, /): ");
        String operator1 = scanner.nextLine();

        // Input dan validasi angka kedua
        double b = getValidOperand(scanner, "Masukkan angka kedua: ");

        // Input operator kedua
        System.out.println("Masukkan operator kedua (+, -, *, /): ");
        String operator2 = scanner.nextLine();

        // Input dan validasi angka ketiga
        double c = getValidOperand(scanner, "Masukkan angka ketiga: ");

        // Komputasi dengan mempertimbangkan prioritas operator
        String finalResult = computeWithPrecedence(a, operator1, b, operator2, c, kalkulator);

        System.out.println("Hasil: " + finalResult);

        scanner.close();
    }

    private static double getValidOperand(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                double value = Double.parseDouble(input);

                if (value < MIN_RANGE || value > MAX_RANGE) {
                    System.out.println("Error: Angka harus dalam rentang -32,768 hingga 32,767! Silakan coba lagi.");
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka, bukan karakter atau simbol! Silakan coba lagi.");
            }
        }
    }

    private static String computeWithPrecedence(double a, String operator1, double b, String operator2, double c,
            Kalkulator kalkulator) {
        String tempResultStr;
        double tempResult;

        if ((operator2.equals("*") || operator2.equals("/")) && (operator1.equals("+") || operator1.equals("-"))) {
            // Prioritaskan operator kedua
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
            // Prioritaskan operator pertama
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
