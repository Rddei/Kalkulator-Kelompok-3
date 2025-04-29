package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator(); // 1
        AsalPerin perinter = new AsalPerin();

        perinter.perin( "Masukkan angka pertama: ");
        double a = InputHelper.getValidOperand(scanner); // 2
        perinter.perin("Masukkan operator pertama (+, -, *, /): ");
        String operator1 = scanner.nextLine(); // 3
        perinter.perin( "Masukkan angka kedua: ");
        double b = InputHelper.getValidOperand(scanner); // 4
        perinter.perin("Masukkan operator kedua (+, -, *, /): ");
        String operator2 = scanner.nextLine(); // 5

        perinter.perin("Masukkan angka ketiga: ");
        double c = InputHelper.getValidOperand(scanner); // 6

        String finalResult = ComputeHelper.computeWithPrecedence(a, operator1, b, operator2, c, kalkulator); // 7
        perinter.perin("Hasil: " + finalResult); // 8

        scanner.close(); // 9
    }
}
