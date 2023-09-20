package com.tiendaRopa.Domain.Model;

public class CategoriaProducto {
    private final int id;
    private final String nombre;

    public CategoriaProducto(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public boolean sosCategoriaProducto(String nombre){
        return this.nombre.equals(nombre);
    }
}
