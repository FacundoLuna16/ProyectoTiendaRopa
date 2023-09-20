package com.tiendaRopa.Domain.Model;

public class Temporada {
    private final int id;
    private final String nombre;

    public Temporada(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public boolean sosTemporada(String nombre){
        return this.nombre.equals(nombre);
    }
}
