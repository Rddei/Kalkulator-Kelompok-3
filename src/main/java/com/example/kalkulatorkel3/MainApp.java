package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Masukkan angka pertama: ");
        double a = scanner.nextDouble();

        System.out.println("Masukkan angka kedua: ");
        double b = scanner.nextDouble();

        System.out.println("Masukkan operator (+, -, *, /): ");
        String operator = scanner.next();

        String hasil = kalkulator.komputasi(a, b, operator);
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}