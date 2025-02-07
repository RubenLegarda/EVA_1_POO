package com.legrey.eva1_1_clases_objetos;
public class EVA1_1_CLASES_OBJETOS {

    public static void main(String[] args) {
        //CREAR UN OBJETO
        //INSTANCIAR
        //Identificador para guardar la direccion en memoria
        //variable de un tipo de dato abstracto
        Persona perso1;//declaramos una variable de tipo persona
        //asignamos memoria
        perso1 = new Persona();//creamos un objeto de tipo de persona
        perso1.edad = 10;
        perso1.genero = "H";
        perso1.nombre = "Juan Perez";
        perso1.imprimirDatos();
        System.out.println(perso1);
        //JAVA:
        //No accedemos a direcciones reales de memoria (RAM)
        //A las direcciones de memoria (falsas) se les llama
        //REFERENCIAS
        //APUNTADOR --> Variable que almacena una direcciion (REAL) de memporia (RAM)
    }
}

class Persona{
    //DATOS - ESTADO - ATRIBUTOS
    String nombre;
    int edad;
    String genero;
    //COMPORTAMIENTO
    void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        
    }
}
