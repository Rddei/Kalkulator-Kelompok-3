package com.example.kalkulatorkel3;

import java.util.Scanner;

public class MainApp {
    private static final double MIN_RANGE = -32768;
    private static final double MAX_RANGE = 32767;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        // Input dan validasi angka pertama
        double a = getValidOperand(scanner, "Masukkan angka pertama: ");

        // Input operator pertama
        System.out.println("Masukkan operator pertama (+, -, *, /): ");
        String operator1 = scanner.nextLine();

        // Input dan validasi angka kedua
        double b = getValidOperand(scanner, "Masukkan angka kedua: ");

        // Input operator kedua
        System.out.println("Masukkan operator kedua (+, -, *, /): ");
        String operator2 = scanner.nextLine();

        // Input dan validasi angka ketiga
        double c = getValidOperand(scanner, "Masukkan angka ketiga: ");

        // Operasi pertama
        String hasil1 = kalkulator.komputasi(a, b, operator1);
        if (hasil1.startsWith("Error")) {
            System.out.println(hasil1); // Cetak pesan error dari operasi pertama
            scanner.close();
            return;
        }

        // Konversi hasil pertama ke double
        double hasilPertama;
        try {
            hasilPertama = Double.parseDouble(hasil1);
        } catch (NumberFormatException e) {
            System.out.println("Error: Tidak dapat melanjutkan karena hasil operasi pertama tidak valid!");
            scanner.close();
            return;
        }

        // Operasi kedua
        String hasilFinal = kalkulator.komputasi(hasilPertama, c, operator2);
        System.out.println("Hasil: " + hasilFinal);

        scanner.close();
    }

    private static double getValidOperand(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            // Validasi apakah input adalah angka
            try {
                double value = Double.parseDouble(input);

                // Validasi rentang angka
                if (value < MIN_RANGE || value > MAX_RANGE) {
                    System.out.println("Error: Angka harus dalam rentang -32,768 hingga 32,767! Silakan coba lagi.");
                    continue;
                }

                return value; // Input valid, kembalikan nilai
            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka, bukan karakter atau simbol! Silakan coba lagi.");
            }
        }
    }
}