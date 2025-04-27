package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        double a = InputHelper.getValidOperand(scanner, "Masukkan angka pertama: ");
        System.out.println("Masukkan operator pertama (+, -, *, /): ");
        String operator1 = scanner.nextLine();

        double b = InputHelper.getValidOperand(scanner, "Masukkan angka kedua: ");
        System.out.println("Masukkan operator kedua (+, -, *, /): ");
        String operator2 = scanner.nextLine();

        double c = InputHelper.getValidOperand(scanner, "Masukkan angka ketiga: ");

        String finalResult = ComputeHelper.computeWithPrecedence(a, operator1, b, operator2, c, kalkulator);
        System.out.println("Hasil: " + finalResult);

        scanner.close();
    }
}
