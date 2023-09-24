package com.tiendaRopa.Infraestructure.Dao;

import com.tiendaRopa.Infraestructure.entity.TemporadaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTemporadaDao extends JpaRepository<TemporadaEntity, String> {
}
