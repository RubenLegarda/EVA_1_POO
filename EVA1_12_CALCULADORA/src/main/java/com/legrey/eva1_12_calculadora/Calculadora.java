package com.legrey.eva1_12_calculadora;

public class Calculadora {
    public static int sumar(int v1, int v2){
        int resu;
        resu = v1 + v2;
        return resu;
    }
    public static int resta(int v1, int v2){
        int resu;
        resu = v1 - v2;
        return resu;
    }
    public static int multiplicar(int v1, int v2){
        int resu;
        resu = v1 * v2;
        return resu;
    }
    public static int dividir(int v1, int v2){
        int resu;
        resu = v1 / v2;
        return resu;
    }
    public static int potenciar(int v1, int v2){
        int resu;
        resu = (int) Math.pow(v1, v2);
        return resu;
    }
}
