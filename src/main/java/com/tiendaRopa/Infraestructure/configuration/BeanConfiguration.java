package com.tiendaRopa.Infraestructure.configuration;

import com.tiendaRopa.Domain.Service.DomainProductoService;
import com.tiendaRopa.Domain.Service.ProductoService;
import com.tiendaRopa.Domain.repository.ProductoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.tiendaRopa.Domain.repository")
public class BeanConfiguration {

    @Bean
    public ProductoService productoService(ProductoRepository productoRepository) {
        return new DomainProductoService(productoRepository);
    }
}

