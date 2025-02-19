package com.legrey.eva1_9_television;

public class Television {
    private boolean encendido;
    private int volumen;
    private int canal;
    
    public Television(){
     encendido = false;
     canal = 3;
     volumen = 10;
    }
    public Television(boolean en, int can, int vol){
    encendido = en;
    canal = can;
    volumen = vol;
    }
    
    public void encenderApagar(){
     if(encendido == true)//TV encendida
         encendido = false;// apaga la TV
     else
         encendido = true;
     
    }
     public void imprimirDatos(){
         if(encendido == true)
             System.out.println("TV Encendida");
         else
             System.out.println("TV Apagada");
         
         System.out.println("Voulumen: " + volumen);
         System.out.println("Canal: " + canal);
     }
     //VOLUMEN REQUIERE DOS METODOS: SUBIR Y BAJAR VOLUMEN
     public void subirVolumen(){
         if (volumen < 100 && encendido == true)
         volumen += 1;//acumulador --> volumen = volumen + 1;
     }
     public void bajarVolumen(){
         if (volumen > 0 && encendido == true)
         volumen -= 1;//acumulador --> volumen = volumen - 1;
     }
     
     //CANAL REQUIERE TRES METODOS: SUBIR, BAJAR ASIGNAR CANAL
     public void subirCanal(){
         if (encendido == true)
            if(canal == 10)
                canal = 0;
            else 
                canal += 1;//acumulador --> canal = canal + 1;

     }
     public void bajarCanal(){
         if (encendido == true)
            if(canal == 0)
                canal = 10;
            else
                canal -= 1;//acumulador --> canal = canal - 1;

     }
     public void setCanal(int valor){
     canal = valor;
     }
    }
