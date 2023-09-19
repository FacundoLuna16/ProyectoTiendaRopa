package Ropa;

public class Temporada {
    private int id;
    private String nombre;

    public Temporada(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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