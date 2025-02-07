package com.legrey.eva1_4_auto;

public class Vehiculo {
    //ATRIBUTOS - PRIVADOS
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    //CONSTRUCTORES - METODOS
    //METODOS - COMPORTAMIENTO
    //GET Y SET
    public String getMarca(){
    return marca;
    }
    public String getModelo(){
    return modelo;
    }
    public double getPrecio(){
    return precio;
    }
    public int getYear(){
    return year;
    }
    public String getColor(){
    return color;
    }
    public void setMarca(String valor){
    marca = valor;
    }
    public void setModelo(String valor){
    modelo = valor;
    }
    public void setPrecio(double valor){
    precio = valor;
    }
    public void setYear(int valor){
    year = valor;
    }
    public void setColor(String valor){
    color = valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos del vehiculo: ");
        //System.out.println("Marca: " + getMarca());
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Anio: " + year);
        System.out.println("Color: " + color);
    }
}
