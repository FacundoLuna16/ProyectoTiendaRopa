package com.tiendaRopa.Domain.repository;

import com.tiendaRopa.Domain.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Spring Data JPA proporciona automáticamente métodos CRUD estándar.

    // Puedes definir métodos de consulta personalizados aquí.
    List<Producto> findByNombre(String nombre);
    List<Producto> findByCategoria(String categoria);
    List<Producto> findByTemporada(String temporada);

    List<Producto> getAll();
}

