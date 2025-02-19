package Tienda;

public class Clientes {
    private String nombre;
    private String apellido;
    private String rfc;
    private boolean tipoPersona;
    private int edad;
    
    //Nombre
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String valor){
    nombre = valor;
    }
    //Apellido
    public String getApellido(){
    return apellido;
    }
    public void setApellido(String valor){
    apellido = valor;
    }
    //RFC
    public String getRfc(){
    return rfc;
    }
    public void setRfc(String valor){
    rfc = valor;
    }
    //TipoPersona
    public boolean getTipoPersona(){
    return tipoPersona;
    }
    public void settipoPersona(boolean valor){
    tipoPersona = valor;
    }
    //Edad
    public int getEdad(){
    return edad;
    }
    public void setEdad(int valor){
    edad = valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos del cliente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("RFC: " + rfc);
        if (tipoPersona == true){
            System.out.println("Tipo de Persona: Fisica");
        }
        else{
            System.out.println("Tipo de Persona: Moral");
        }
        System.out.println("Edad: " + edad);
    }
}
