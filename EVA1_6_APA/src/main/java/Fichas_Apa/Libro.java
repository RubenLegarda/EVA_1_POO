package Fichas_Apa;

public class Libro {
    private String autor;
    private String titulo;
    private int anio;
    private String ciudad;
    private String editorial;
            
    //Autor
    public String getAutor(){
    return autor;
    }
    public void setAutor(String valor){
    autor = valor;
    }
    //Titulo
    public String getTitulo(){
    return titulo;
    }
    public void setTitulo(String valor){
    titulo = valor;
    }
    //Anio
    public int getAnio(){
    return anio;
    }
    public void setAnio(int valor){
    anio = valor;
    }
    //Ciudad
    public String getCiudad(){
    return ciudad;
    }
    public void setCiudad(String valor){
    ciudad = valor;
    }
    //Editorial
    public String getEditorial(){
    return editorial;
    }
    public void setEditorial(String valor){
    editorial = valor;
    }
    //Referencia
    public void imprimirDatos(){
        System.out.println(autor + ", " + titulo + ", (" + anio + "), " + ciudad + ", " + editorial + ".");
    }
} 
