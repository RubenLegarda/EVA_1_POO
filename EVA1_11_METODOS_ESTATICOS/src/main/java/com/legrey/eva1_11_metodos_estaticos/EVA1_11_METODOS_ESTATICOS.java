package com.legrey.eva1_11_metodos_estaticos;

public class EVA1_11_METODOS_ESTATICOS {

    public static void main(String[] args) {
        double valorAleatorio = Math.random();
        int valor = (int)(valorAleatorio * 100);
        System.out.println(valorAleatorio);
        System.out.println(valor);
        //
        //Math math = Math();
        Persona perso = new Persona ();
        perso.mostrarMensaje();
        //USAR FORMULAS DE TEMPERATURA
        //Temperaturas tempe = new Temperaturas ();
        //System.out.println(tempe.convertirFaC(100));
        System.out.println(Temperaturas.convertirFaC(100));
        System.out.println(Temperaturas.convertirCaF(100));
        System.out.println(Temperaturas.convertirCaK(100));
        System.out.println(Temperaturas.convertirKaC(100));
        System.out.println(Temperaturas.convertirFaK(100));
        System.out.println(Temperaturas.convertirKaF(100));
        
    }
}

class Persona{
    int valor;
    public void mostrarMensaje(){
        System.out.println("Hola mundo!!");
    }
}