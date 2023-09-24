package com.tiendaRopa.Domain.Controller;

import com.tiendaRopa.Domain.Model.Temporada;
import com.tiendaRopa.Domain.Service.TemporadaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/temporadas")
public class TemporadaControlador {
    private final TemporadaService temporadaService;


    public TemporadaControlador(TemporadaService temporadaService) {
        this.temporadaService = temporadaService;
    }

    @GetMapping
    public List<Temporada> temporadas() {
        return temporadaService.findAll()
                .stream()
                .map(temporada -> new Temporada(temporada.getId(), temporada.getNombre()))
                .collect(Collectors.toList());
    }
}
