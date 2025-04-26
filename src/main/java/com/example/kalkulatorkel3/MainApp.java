package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    private static final double MIN_RANGE = -32768;
    private static final double MAX_RANGE = 32767; // 1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        // Input dan validasi angka pertama
        double a = getValidOperand(scanner, "Masukkan angka pertama: "); // 2

        // Input operator pertama
        System.out.println("Masukkan operator pertama (+, -, *, /): ");
        String operator1 = scanner.nextLine(); //11

        // Input dan validasi angka kedua
        double b = getValidOperand(scanner, "Masukkan angka kedua: "); // 12

        // Input operator kedua
        System.out.println("Masukkan operator kedua (+, -, *, /): ");
        String operator2 = scanner.nextLine(); //13

        // Input dan validasi angka ketiga
        double c = getValidOperand(scanner, "Masukkan angka ketiga: "); //14

        // Komputasi dengan mempertimbangkan prioritas operator
        String finalResult = computeWithPrecedence(a, operator1, b, operator2, c, kalkulator); //15

        System.out.println("Hasil: " + finalResult); //51

        scanner.close();
    }

    private static double getValidOperand(Scanner scanner, String prompt) {
        while (true) {// 3
            System.out.println(prompt);
            String input = scanner.nextLine();//4

            try {//5
                double value = Double.parseDouble(input);//6

                if (value < MIN_RANGE || value > MAX_RANGE) {//7
                    System.out.println("Error: Angka harus dalam rentang -32,768 hingga 32,767! Silakan coba lagi.");
                    continue;//8
                }

                return value;//9
            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka, bukan karakter atau simbol! Silakan coba lagi.");//10
            }
        }
    }

    private static String computeWithPrecedence(double a, String operator1, double b, String operator2, double c,
            Kalkulator kalkulator) {
        String tempResultStr;
        double tempResult; //16

        if ((operator2.equals("*") || operator2.equals("/")) && (operator1.equals("+") || operator1.equals("-"))) { //17
            // Prioritaskan operator kedua
            tempResultStr = kalkulator.komputasi(b, c, operator2);//18
            if (tempResultStr.startsWith("Error")) {//38
                return tempResultStr;//39
            }

            try {//40
                tempResult = Double.parseDouble(tempResultStr);//41
            } catch (NumberFormatException e) {
                return "Error: Hasil antara angka kedua dan ketiga tidak valid!";//42
            }

            return kalkulator.komputasi(a, tempResult, operator1);//43
        } else {
            // Prioritaskan operator pertama
            tempResultStr = kalkulator.komputasi(a, b, operator1); //44
            if (tempResultStr.startsWith("Error")) {//45
                return tempResultStr; //46
            }

            try {//47
                tempResult = Double.parseDouble(tempResultStr);//48
            } catch (NumberFormatException e) {
                return "Error: Hasil antara angka pertama dan kedua tidak valid!"; //49
            }

            return kalkulator.komputasi(tempResult, c, operator2);//50
        }
    }
}
