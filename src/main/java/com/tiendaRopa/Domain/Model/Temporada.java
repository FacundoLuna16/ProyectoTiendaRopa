package com.tiendaRopa.Domain.Model;

public class Temporada {
    private final String id;
    private final String nombre;

    public Temporada(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean sosTemporada(String nombre){
        return this.nombre.equals(nombre);
    }
}
