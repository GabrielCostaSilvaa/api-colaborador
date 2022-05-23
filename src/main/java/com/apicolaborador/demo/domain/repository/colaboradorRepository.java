package com.apicolaborador.demo.domain.repository;
import java.util.List;

import com.apicolaborador.demo.domain.entity.colaborador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface colaboradorRepository extends JpaRepository<colaborador,Long>  {

    @Query("SELECT u FROM User u WHERE u.login = ?1 and u.senha = ?2")
    colaborador findcolaboradorByLoginAndPassword(String login, String password);

}    