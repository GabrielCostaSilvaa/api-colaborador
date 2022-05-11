package com.apicliente.demo.domain.repository;
import java.util.List;

import com.apicliente.demo.domain.entity.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface clienteRepository extends JpaRepository<cliente,Long>  {

    @Query("SELECT u FROM User u WHERE u.login = ?1 and u.senha = ?2")
    cliente findClienteByLoginAndPassword(String login, String password);

}    