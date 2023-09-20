package com.tiendaRopa.Domain.Service;

import com.tiendaRopa.Domain.Model.Producto;
import com.tiendaRopa.Domain.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // Esta anotación le dice a Spring que esta clase es un componente de la capa de servicio
public class DomainProductoService implements ProductoService{
    private final ProductoRepository productoRepository;

    public DomainProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.getAll();
    }
}
