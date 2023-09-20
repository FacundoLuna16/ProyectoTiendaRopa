package com.tiendaRopa.Infraestructure.repository;

import com.tiendaRopa.Domain.Model.Producto;
import com.tiendaRopa.Domain.repository.ProductoRepository;
import com.tiendaRopa.Infraestructure.Dao.JpaProductoDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JpaProductoRepository implements ProductoRepository {

    private final JpaProductoDao productoDao;

    public JpaProductoRepository(JpaProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    public List<Producto> getAll() {

        return null;
    }

    @Override
    public void save(Producto producto) {

    }

    @Override
    public void update(Producto producto) {

    }

    @Override
    public void delete(Producto producto) {

    }

    @Override
    public Producto findById(int id) {
        return null;
    }

    @Override
    public List<Producto> findByTemporada() {
        return null;
    }
}
