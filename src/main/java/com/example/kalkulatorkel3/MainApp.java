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

        do{ // 2
            perinter.perin( "Masukkan angka pertama: ");
            inputAngkaPertama = InputHelper.getRawInput(scanner); // 3
        }while(!ValidatorAngka.isValidDouble(inputAngkaPertama)); // 4
        double nilaiPertama = ValidatorAngka.parseDouble(inputAngkaPertama);

        perinter.perin("Masukkan operator pertama (+, -, *, /): "); // 5
        String operator1 = scanner.nextLine(); 

        do{ // 6
            perinter.perin( "Masukkan angka pertama: ");
            inputAngkaKedua = InputHelper.getRawInput(scanner); // 7
        }while(!ValidatorAngka.isValidDouble(inputAngkaKedua)); // 8
        double nilaiKedua = ValidatorAngka.parseDouble(inputAngkaKedua); 

        perinter.perin("Masukkan operator kedua (+, -, *, /): ");
        String operator2 = scanner.nextLine(); // 9

        do{ // 10
            perinter.perin( "Masukkan angka ketiga: ");
            inputAngkaKetiga = InputHelper.getRawInput(scanner); // 11
        }while(!ValidatorAngka.isValidDouble(inputAngkaKetiga));
        double nilaiKetiga = ValidatorAngka.parseDouble(inputAngkaKetiga); // 12

        String finalResult = ComputeHelper.computeWithPrecedence(nilaiPertama, operator1, nilaiKedua, operator2, nilaiKetiga, kalkulator); // 7
        perinter.perin("Hasil: " + finalResult); // 13

        scanner.close(); // 9
    }
}
