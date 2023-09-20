package com.tiendaRopa.Infraestructure.Dao;

import com.tiendaRopa.Infraestructure.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductoDao extends JpaRepository<ProductoEntity, Integer> {

}
