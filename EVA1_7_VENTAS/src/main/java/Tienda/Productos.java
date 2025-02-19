package Tienda;

public class Productos {
    private String nombre;
    private String marca;
    private double precio;
    private String clave;
    private int inventario;
    
    //Nombre
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String valor){
    nombre = valor;
    }
    //Marca
    public String getMarca(){
    return marca;
    }
    public void setMarca(String valor){
    marca = valor;
    }
    //Precio
    public double getPrecio(){
    return precio;
    }
    public void setPrecio(double valor){
    precio = valor;
    }
    //Clave
    public String getClave(){
    return clave;
    }
    public void setClave(String valor){
    clave = valor;
    }
    //Inventario
    public int getInventario(){
    return inventario;
    }
    public void setInventario(int valor){
    inventario = valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos del producto");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
        System.out.println("Clave: " + clave);
        System.out.println("Inventario: " + inventario);
    }
}
