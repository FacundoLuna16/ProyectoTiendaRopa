package com.tiendaRopa.Ropa;

import javax.persistence.*;

@Entity
public class Ropa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String marca;
    private String color;
    private String talla;
    private int precio;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaRopa categoria;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;




    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTalla() {
        return talla;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaRopa getCategoria() {
        return categoria;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(CategoriaRopa categoria) {
        this.categoria = categoria;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }
}
