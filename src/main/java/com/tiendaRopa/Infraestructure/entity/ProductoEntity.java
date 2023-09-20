package com.tiendaRopa.Infraestructure.entity;

import com.tiendaRopa.Domain.Model.Producto;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class ProductoEntity {
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
    private CategoriaProductoEntity categoria;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private TemporadaEntity temporadaEntity;

    public ProductoEntity(){}

    public ProductoEntity(String nombre, String marca, String color, String talla, int precio, int cantidad, CategoriaProductoEntity categoria, TemporadaEntity temporadaEntity){
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.temporadaEntity = temporadaEntity;
    }


    public Producto toProduct(){
        return new Producto(
                this.id,
                this.nombre,
                this.marca,
                this.categoria.toCategoria(),
                this.temporadaEntity.toTemporada(),
                this.color,
                this.talla,
                this.precio,
                this.cantidad
        );
    }

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

    public CategoriaProductoEntity getCategoria() {
        return categoria;
    }

    public TemporadaEntity getTemporada() {
        return temporadaEntity;
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

    public void setCategoria(CategoriaProductoEntity categoria) {
        this.categoria = categoria;
    }

    public void setTemporada(TemporadaEntity temporadaEntity) {
        this.temporadaEntity = temporadaEntity;
    }
}
