package com.example.konversisuhuapps;

public class KonversiFunction {
    public static double toReamur(double nilaiCelcius){
        return nilaiCelcius * 0.8 ;
    }
    public static double toKelvin(double nilaiCelcius){
        return nilaiCelcius + 273;
    }
    public static double toFahrenheit(double nilaiCelcius){
        return (nilaiCelcius * 1.8 ) + 32;
    }
}
