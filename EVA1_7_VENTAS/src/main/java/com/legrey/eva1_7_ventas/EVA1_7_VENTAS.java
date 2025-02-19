package com.legrey.eva1_7_ventas;

import Tienda.Clientes;
import Tienda.Productos;

public class EVA1_7_VENTAS {

    public static void main(String[] args) {
    Productos producto = new Productos();
    Clientes cliente = new Clientes();
    
    cliente.setNombre("Ruben");
    cliente.setApellido("Legarda");
    cliente.setEdad(19);
    cliente.setRfc("whfoheofhw235252");
    cliente.settipoPersona(true);
    cliente.imprimirDatos();
    producto.setNombre("Foco");
    producto.setMarca("Ford");
    producto.setPrecio(10.000);
    producto.setClave("32748923juu");
    producto.setInventario(10);
    producto.imprimirDatos();
    }
}
