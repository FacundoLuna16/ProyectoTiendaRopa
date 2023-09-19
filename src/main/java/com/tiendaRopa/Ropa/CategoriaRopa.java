package Ropa;

public class CategoriaRopa {
    private int id;
    private String tipo;

    public CategoriaRopa(id, tipo) {
        this.id = id;
        this.tipo = tipo;
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
}