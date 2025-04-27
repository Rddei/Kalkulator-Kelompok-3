package com.example.kalkulatorkel3;

import java.util.Scanner;

public class InputHelper {
    private static final double MIN_RANGE = -32768;
    private static final double MAX_RANGE = 32767;

    public static double getValidOperand(Scanner scanner, String prompt) {
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
}
