package com.example.kalkulatorkel3;

public class Kalkulator {
    public double tambah(double a, double b) {
        return a + b;//22
    }

    public double kurang(double a, double b) {
        return a - b;//25
    }

    public double kali(double a, double b) {
        return a * b;//28
    }

    public double bagi(double a, double b) {
        if (b == 0) { //32
            throw new IllegalArgumentException("Pembagi tidak boleh nol");//33
        }
        return a / b;//34
    }

    public String komputasi(double a, double b, String operator) {
        switch (operator) {//19
            case "+"://20
                return String.valueOf(tambah(a, b));//21
            case "-"://23
                return String.valueOf(kurang(a, b));//24
            case "*"://26
                return String.valueOf(kali(a, b));//27
            case "/"://29
                try {//30
                    return String.valueOf(bagi(a, b));//31
                } catch (IllegalArgumentException e) {
                    return "Error: " + e.getMessage();//35
                }
            default://36
                return "Error: Operator tidak valid (+, -, *, /)";//37
        }
    }
}
