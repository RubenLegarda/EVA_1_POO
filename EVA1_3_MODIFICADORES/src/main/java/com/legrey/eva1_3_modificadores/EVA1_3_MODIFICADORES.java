package com.legrey.eva1_3_modificadores;

public class EVA1_3_MODIFICADORES {

    public static void main(String[] args) {
        //INSRANCIAR UN OBJETO
        //CLASE IDENTIFICADOR = new CONSTRUCTOR(PARAMETROS);
        Persona perso = new Persona();
        perso.setNombre("Ruben Oswaldo");
        perso.setApellidos("Legarda Reyna");
        perso.setEdad(19);
        perso.setGenero("Masculino");
        perso.setCurp("EGWTRFBTWERTBC76WIT23124134");
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellidos: " + perso.getApellidos());
        System.out.println("Edad: " + perso.getEdad());
        System.out.println("Genero: " + perso.getGenero());
        System.out.println("CURP: " + perso.getCurp());
    }
}
