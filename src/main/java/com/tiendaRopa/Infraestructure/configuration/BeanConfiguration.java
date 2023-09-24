package com.tiendaRopa.Infraestructure.configuration;

import com.tiendaRopa.Domain.Service.DomainProductoService;
import com.tiendaRopa.Domain.Service.DomainTemporadaService;
import com.tiendaRopa.Domain.Service.ProductoService;
import com.tiendaRopa.Domain.Service.TemporadaService;
import com.tiendaRopa.Domain.repository.ProductoRepository;
import com.tiendaRopa.Domain.repository.TemporadaRepository;
import com.tiendaRopa.Infraestructure.Dao.JpaTemporadaDao;
import com.tiendaRopa.Infraestructure.repository.JpaTemporadaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfiguration {

    @Bean
    public ProductoService productoService(ProductoRepository productoRepository) {
        return new DomainProductoService(productoRepository);
    }

    @Bean
    public TemporadaService temporadaService(TemporadaRepository temporadaRepository) {
        return new DomainTemporadaService(temporadaRepository);
    }

}

