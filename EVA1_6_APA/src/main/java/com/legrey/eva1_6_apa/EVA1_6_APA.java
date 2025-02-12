package com.legrey.eva1_6_apa;

import Fichas_Apa.Libro;
import Fichas_Apa.SitioWeb;
import java.util.Scanner;

public class EVA1_6_APA {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        Libro libro = new Libro();
        SitioWeb sitioweb = new SitioWeb();
        
        //Introducir datos del SitioWeb
        System.out.println("Autor del Libro: ");
        String aut = captu.nextLine();
        libro.setAutor(aut);
        System.out.println("Titulo del Libro: ");
        String tit = captu.nextLine();
        libro.setTitulo(tit);
        System.out.println("Anio del Libro: ");
        int ani = captu.nextInt();
        libro.setAnio(ani);
        String bug1 = captu.nextLine();
        System.out.println("Ciudad del Libro: ");
        String ciu = captu.nextLine();
        libro.setCiudad(ciu);
        System.out.println("Editorial del Libro: ");
        String edi = captu.nextLine();
        libro.setEditorial(edi);

        //Imprmir APA del libro
        libro.imprimirDatos();
        System.out.println("");
        //Introducir datos del SitioWeb
        System.out.println("Autor del articulo: ");
        String autSitio = captu.nextLine();
        sitioweb.setAutor(autSitio);
        System.out.println("Nombre del sitio web: ");
        String nom = captu.nextLine();
        sitioweb.setNombreSitio(nom);
        System.out.println("Anio: ");
        int aniSitio = captu.nextInt();
        sitioweb.setAnio(aniSitio);
        String bug2 = captu.nextLine();
        System.out.println("Mes: ");
        String mesSitio = captu.nextLine();
        sitioweb.setMes(mesSitio);
        System.out.println("Dia: ");
        int dia = captu.nextInt();
        sitioweb.setDia(dia);
        String bug3 = captu.nextLine();
        System.out.println("URL: ");
        String url = captu.nextLine();
        sitioweb.setUrl(url);

        //Imprimir APA del SitioWeb
        sitioweb.imprimirDatos();
    }
}
