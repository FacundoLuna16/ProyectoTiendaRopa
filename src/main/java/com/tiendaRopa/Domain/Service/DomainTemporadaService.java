package com.tiendaRopa.Domain.Service;

import com.tiendaRopa.Domain.Model.Temporada;
import com.tiendaRopa.Domain.repository.TemporadaRepository;

import java.util.List;

public class DomainTemporadaService implements TemporadaService{

    private final TemporadaRepository temporadaRepository;

    public DomainTemporadaService(TemporadaRepository temporadaRepository) {
        this.temporadaRepository = temporadaRepository;
    }

    @Override
    public List<Temporada> findAll() {
        return temporadaRepository.getAll();
    }
}
