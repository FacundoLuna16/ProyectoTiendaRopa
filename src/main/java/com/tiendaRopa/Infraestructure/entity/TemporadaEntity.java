package com.tiendaRopa.Infraestructure.entity;

import com.tiendaRopa.Domain.Model.Temporada;

import javax.persistence.*;

@Entity
@Table(name = "Temporada")
public class TemporadaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public TemporadaEntity(){}

    public TemporadaEntity(String nombre){
        this.nombre = nombre;
    }

    public Temporada toTemporada(){
        return new Temporada(
                this.id,
                this.nombre
        );
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}