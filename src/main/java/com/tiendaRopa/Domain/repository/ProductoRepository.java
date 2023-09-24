package com.tiendaRopa.Domain.repository;

import com.tiendaRopa.Domain.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository {
    List<Producto> getAll();
}

