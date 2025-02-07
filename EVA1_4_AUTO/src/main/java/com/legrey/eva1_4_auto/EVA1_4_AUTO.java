package com.legrey.eva1_4_auto;

import java.util.Scanner;

public class EVA1_4_AUTO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Marca del vehiculo: ");
        String marc = captu.nextLine();
        vehiculo.setMarca(marc);
        System.out.println("Modelo del vehiculo: ");
        String mod = captu.nextLine();
        vehiculo.setMarca(mod);
        System.out.println("Anio del vehiculo: ");
        String an = captu.nextLine();
        vehiculo.setMarca(an);
        System.out.println("Color del vehiculo: ");
        String col = captu.nextLine();
        vehiculo.setMarca(col);
        System.out.println("Precio del vehiculo: ");
        String pre = captu.nextLine();
        vehiculo.setMarca(pre);
        vehiculo.setMarca("Chevrolet");
        vehiculo.setModelo("Camaro");
        vehiculo.setYear(2015);
        vehiculo.setColor("Amarillo");
        vehiculo.setPrecio(300000);
        /*System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Anio: " + vehiculo.getYear());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Precio: " + vehiculo.getPrecio());*/
        vehiculo.imprimirDatos();
    }
    
}
