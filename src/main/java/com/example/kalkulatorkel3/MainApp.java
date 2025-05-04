package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator(); // 1

        double a = InputHelper.getValidOperand(scanner, "Masukkan angka pertama: "); // 2
        System.out.println("Masukkan operator pertama (+, -, *, /): ");
        String operator1 = scanner.nextLine(); // 3

        double b = InputHelper.getValidOperand(scanner, "Masukkan angka kedua: "); // 4
        System.out.println("Masukkan operator kedua (+, -, *, /): ");
        String operator2 = scanner.nextLine(); // 5

        double c = InputHelper.getValidOperand(scanner, "Masukkan angka ketiga: "); // 6

        String finalResult = ComputeHelper.computeWithPrecedence(a, operator1, b, operator2, c, kalkulator); // 7
        System.out.println("Hasil: " + finalResult); // 8

        scanner.close(); // 9
    }
}





