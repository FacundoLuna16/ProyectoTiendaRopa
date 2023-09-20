package com.tiendaRopa.Domain.Model;

public class Producto {
    private final int id;
    private final String nombre;
    private final String marca;
    private final String color;
    private final String talla;
    private final int precio;
    private final int cantidad;
    private final CategoriaProducto categoria;
    private final Temporada temporada;
    private final String descripcion;

    public Producto(int id, String nombre, String marca, CategoriaProducto categoria, Temporada temporada, String color, String talla, int precio, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = "";
        this.marca = marca;
        this.categoria = categoria;
        this.temporada = temporada;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public boolean estaDisponible(){
        return this.cantidad > 0;
    }

    public String ToString(){
        return this.nombre + " " + this.marca + " " + this.color + " " + this.talla + " " + this.precio + " " + this.cantidad;
    }

}
