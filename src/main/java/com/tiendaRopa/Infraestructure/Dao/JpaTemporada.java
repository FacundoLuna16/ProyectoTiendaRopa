package com.tiendaRopa.Infraestructure.Dao;

import com.tiendaRopa.Infraestructure.entity.TemporadaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTemporada extends JpaRepository<TemporadaEntity, Integer> {
}
