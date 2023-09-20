package com.tiendaRopa.Infraestructure.Dao;

import com.tiendaRopa.Infraestructure.entity.CategoriaProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCategoriaProductoDao extends JpaRepository<CategoriaProductoEntity, Integer> {
}
