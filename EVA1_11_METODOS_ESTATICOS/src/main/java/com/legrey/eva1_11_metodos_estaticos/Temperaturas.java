package com.legrey.eva1_11_metodos_estaticos;

public class Temperaturas {
    public static double convertirFaC(double fa){
        double resu;
        resu = (fa - 32) * (5.0/9.0);
        return resu;
    }
    public static double convertirCaF(double ce){
        double resu;
        resu = (ce * (9.0/5.0)) + 32;
        return resu;
    }
    public static double convertirCaK(double ce){
        double resu;
        resu = ce + 273.15;
        return resu;
    }
    public static double convertirKaC(double ke){
        double resu;
        resu = ke - 273.15;
        return resu;
    }
    public static double convertirFaK(double fa){
        double resu;
        resu = ((fa - 32) * (5.0/9.0)) + 273.15;
        return resu;
    }
    public static double convertirKaF(double ke){
        double resu;
        resu = ((1.8) * (ke - 273.15)) + 32;
        return resu;
    }
}