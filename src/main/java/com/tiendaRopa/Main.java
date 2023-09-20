package com.tiendaRopa;

import com.tiendaRopa.Domain.Model.Producto;
import com.tiendaRopa.Infraestructure.entity.ProductoEntity;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto(1, "Remera", "Nike", null, null, "Rojo", "M", 1000, 10);
        System.out.println(producto.ToString());
    }
}