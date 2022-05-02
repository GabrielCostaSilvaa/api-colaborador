package com.apicliente.demo.domain.repository;

import java.util.List;

import com.apicliente.demo.domain.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface clienteRepository extends JpaRepository<Cliente,Long> {
    
}
