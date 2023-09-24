package com.tiendaRopa.Infraestructure.repository;

import com.tiendaRopa.Domain.Model.Producto;
import com.tiendaRopa.Domain.repository.ProductoRepository;
import com.tiendaRopa.Infraestructure.Dao.JpaProductoDao;
import com.tiendaRopa.Infraestructure.entity.ProductoEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
public class JpaProductoRepository implements ProductoRepository {

    private final JpaProductoDao productoDao;

    public JpaProductoRepository(JpaProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    public List<Producto> getAll() {
        return productoDao.findAll().stream().map(ProductoEntity::toProduct).toList();
    }

}


