package com.legrey.eva1_5_television;

public class EVA1_5_TELEVISION {

    public static void main(String[] args) {
    Television tv = new Television();
    tv.imprimirDatos();
    tv.encenderApagar();//BOTON DE ENCENDIDO DEL CONTROL
    tv.subirVolumen();//BOTON DE SUBIR VOLUMEN
    tv.bajarCanal();//BOTON DE BAJAR CANAL
    tv.imprimirDatos();
    tv.setCanal(8);//CANAL INTRODUCIDO
    tv.imprimirDatos();
    tv.subirCanal();
    tv.imprimirDatos();
    tv.subirCanal();
    tv.imprimirDatos();
    tv.subirCanal();
    tv.imprimirDatos();

        
    }
}
