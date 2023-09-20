package com.tiendaRopa.Domain.Service;

import com.tiendaRopa.Domain.Model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> findAll();
}
