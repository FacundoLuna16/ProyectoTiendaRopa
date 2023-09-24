package com.tiendaRopa.Infraestructure.Dao;

import com.tiendaRopa.Infraestructure.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductoDao extends JpaRepository<ProductoEntity, Integer> {

}
