package com.tiendaRopa.Infraestructure.entity;

import com.tiendaRopa.Domain.Model.CategoriaProducto;

import javax.persistence.*;

@Entity
@Table(name = "CategoriaProducto")
public class CategoriaProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipo;

    public CategoriaProductoEntity(){}
    //constructor con parametros el id no se pone porque se genera automaticamente
    public CategoriaProductoEntity(String tipo){
        this.tipo = tipo;
    }
    public CategoriaProducto toCategoria(){
        return new CategoriaProducto(
                this.id,
                this.tipo
        );
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }
}
