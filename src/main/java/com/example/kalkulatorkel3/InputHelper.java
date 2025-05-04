package com.example.kalkulatorkel3;

import java.util.Scanner;

public class InputHelper {
    private static final double MIN_RANGE = -32768;
    private static final double MAX_RANGE = 32767; // 1

    public static double getValidOperand(Scanner scanner, String prompt) {
        while (true) { // 2
            System.out.println(prompt); // 3
            String input = scanner.nextLine();

            try { // 4
                double value = Double.parseDouble(input); // 5

                if (value < MIN_RANGE || value > MAX_RANGE) { // 6
                    System.out.println("Error: Angka harus dalam rentang -32,768 hingga 32,767! Silakan coba lagi."); // 7
                    continue;
                }

                return value; // 8
            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka, bukan karakter atau simbol! Silakan coba lagi."); // 9
            }
        }
    }
}



