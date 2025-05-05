package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator(); // 1
        AsalPerin perinter = new AsalPerin();
        // Operasi operasi = new Operasi();
        // ComputeHelper calc  = new ComputeHelper();

        String inputAngkaPertama;
        String inputAngkaKedua;
        String inputAngkaKetiga;
        String operator1;
        String operator2;

        // Input dan validasi angka pertama
        do { // 2
            perinter.perin("Masukkan angka pertama: ");
            inputAngkaPertama = InputHelper.getRawInput(scanner); // 3
        } while (!ValidatorAngka.isValidDouble(inputAngkaPertama)); // 4
        double nilaiPertama = ValidatorAngka.parseDouble(inputAngkaPertama);

        // Input dan validasi operator pertama
        do {
            perinter.perin("Masukkan operator pertama (+, -, *, /): "); // 5
            operator1 = scanner.nextLine();
        } while (!ValidatorOperator.isValidOperator(operator1));

        // Input dan validasi angka kedua
        do { // 6
            perinter.perin("Masukkan angka kedua: "); 
            inputAngkaKedua = InputHelper.getRawInput(scanner); // 7
        } while (!ValidatorAngka.isValidDouble(inputAngkaKedua)); // 8
        double nilaiKedua = ValidatorAngka.parseDouble(inputAngkaKedua); 

        // Input dan validasi operator kedua
        do {
            perinter.perin("Masukkan operator kedua (+, -, *, /): ");
            operator2 = scanner.nextLine(); // 9
        } while (!ValidatorOperator.isValidOperator(operator2));

        // Input dan validasi angka ketiga
        do { // 10
            perinter.perin("Masukkan angka ketiga: ");
            inputAngkaKetiga = InputHelper.getRawInput(scanner); // 11
        } while (!ValidatorAngka.isValidDouble(inputAngkaKetiga)); // 12
        double nilaiKetiga = ValidatorAngka.parseDouble(inputAngkaKetiga); // 13

        // Komputasi hasil akhir menggunakan precedence operator
        String finalResult = ComputeHelper.computeWithPrecedence(nilaiPertama, operator1, nilaiKedua, operator2, nilaiKetiga, kalkulator); 
        perinter.perin("Hasil: " + finalResult); 

        scanner.close(); // 9
    }
}