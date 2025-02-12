package Fichas_Apa;

public class SitioWeb {
    private String autor;
    private String nombreSitio;
    private int anio;
    private String mes;
    private int dia;
    private String url;
    
    //Autor
    public String getAutor(){
    return autor;
    }
    public void setAutor(String valor){
    autor = valor;
    }
    //Nombre del Sitio
    public String getNombreSitio(){
    return nombreSitio;
    }
    public void setNombreSitio(String valor){
    nombreSitio = valor;
    }
    //Anio
    public int getAnio(){
    return anio;
    }
    public void setAnio(int valor){
    anio = valor;
    }
    //Mes
    public String getMes(){
    return mes;
    }
    public void setMes(String valor){
    mes = valor;
    }
    //Dia
    public int getDia(){
    return dia;
    }
    public void setDia(int valor){
    dia = valor;
    }
    //URL
    public String getUrl(){
    return url;
    }
    public void setUrl(String valor){
    url = valor;
    }
    //Referencia
    public void imprimirDatos(){
    System.out.println(autor + ", (" + dia + " de " + mes + " de " + anio +"), " + nombreSitio + ":" + url);
    }
}
