package com.legrey.eva1_8_constructores;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    //METODOS: NO TIENEN VALOR DE RETORNO
    //MODIFICADOR DE ACCESO NOMBRE DE LA CLASE (LISTA DE PARAMETROS);
    //CONSTRUCTOR DEFAULT: CONSTRUCTOR SIN PARAMETROS
    public Vehiculo(){
        System.out.println("CREANDO OBJETO VEHICULO!");
        //inicializar atributos
        marca = "SIN MARCA";
        modelo = "SIN MODELO";
        year = 0;
        precio = 0;
        color = "SIN COLOR";
    }
    public Vehiculo(String mar, String mod, int y, double pre, String col){
        marca = mar;
        modelo = mod;
        year = y;
        precio = pre;
        color = col;
    }
    
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
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Anio: " + year);
        System.out.println("Color: " + color);
    }
}
