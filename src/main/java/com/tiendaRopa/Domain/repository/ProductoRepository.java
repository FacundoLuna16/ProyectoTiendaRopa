package com.tiendaRopa.Domain.repository;

import com.tiendaRopa.Domain.Model.Producto;

import java.util.List;

public interface ProductoRepository {
    List<Producto> getAll();

    void save(Producto producto);

    void update(Producto producto);

    void delete(Producto producto);

    Producto findById(int id);

    List<Producto> findByTemporada();




}
