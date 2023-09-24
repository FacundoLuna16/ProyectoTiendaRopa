package com.tiendaRopa.Infraestructure.repository;

import com.tiendaRopa.Domain.Model.Temporada;
import com.tiendaRopa.Domain.repository.TemporadaRepository;
import com.tiendaRopa.Infraestructure.Dao.JpaTemporadaDao;
import com.tiendaRopa.Infraestructure.entity.TemporadaEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //Creamos una instancia de esta clase para poder inyectarla en el controller
public class JpaTemporadaRepository implements TemporadaRepository {
    private final JpaTemporadaDao temporadaDao;

    public JpaTemporadaRepository(JpaTemporadaDao jpaTemporadaDao) {
        this.temporadaDao = jpaTemporadaDao;
    }


    @Override
    public List<Temporada> getAll() {
        return temporadaDao.findAll()
                .stream()
                .map(TemporadaEntity::toTemporada)
                .toList();
    }

    //yo: como hago Consider defining a bean of type 'com.tiendaRopa.Infraestructure.Dao.JpaTemporadaDao' in your configuration.
    // tu: en el BeanConfiguration.java


}
