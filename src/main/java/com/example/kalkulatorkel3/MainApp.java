package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator(); // 1
        AsalPerin perinter = new AsalPerin();
        Operasi operasi = new Operasi();
        ComputeHelper calc  = new ComputeHelper();

        String inputAngkaPertama;
        String inputAngkaKedua;
        String inputAngkaKetiga;

        do{
            perinter.perin( "Masukkan angka pertama: ");
            inputAngkaPertama = InputHelper.getRawInput(scanner); // 2 
        }while(!ValidatorAngka.isValidDouble(inputAngkaPertama));
        double nilaiPertama = ValidatorAngka.parseDouble(inputAngkaPertama);

        perinter.perin("Masukkan operator pertama (+, -, *, /): ");
        String operator1 = scanner.nextLine(); // 3

        do{
            perinter.perin( "Masukkan angka pertama: ");
            inputAngkaKedua = InputHelper.getRawInput(scanner); // 2 
        }while(!ValidatorAngka.isValidDouble(inputAngkaKedua));
        double nilaiKedua = ValidatorAngka.parseDouble(inputAngkaKedua);

        perinter.perin("Masukkan operator kedua (+, -, *, /): ");
        String operator2 = scanner.nextLine(); // 5

        do{
            perinter.perin( "Masukkan angka ketiga: ");
            inputAngkaKetiga = InputHelper.getRawInput(scanner); // 6
        }while(!ValidatorAngka.isValidDouble(inputAngkaKetiga));
        double nilaiKetiga = ValidatorAngka.parseDouble(inputAngkaKetiga);

        String finalResult = ComputeHelper.computeWithPrecedence(nilaiPertama, operator1, nilaiKedua, operator2, nilaiKetiga, kalkulator); // 7
        perinter.perin("Hasil: " + finalResult); // 8

        scanner.close(); // 9
    }
}





