package com.tiendaRopa.Infraestructure.entity;

import com.tiendaRopa.Domain.Model.Temporada;

import javax.persistence.*;

@Entity
@Table(name = "Temporada")
public class TemporadaEntity {
    @Id
    private String id;

    @Column(name = "NOMBRE")
    private String nombre;

    public TemporadaEntity(){}

    public TemporadaEntity(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public static TemporadaEntity from(Temporada temporada){
        return new TemporadaEntity( temporada.getId(), temporada.getNombre()
        );
    }

    public Temporada toTemporada(){
        return new Temporada(
                this.id,
                this.nombre
        );
    }


}