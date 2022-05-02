package com.apicliente.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Data
@NoArgsConstructor

public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="nome")
    @NotBlank(message="Nome obrigatório")
    @Length(message="Nome com no máximo 50 caracteres",max=50)
    String CPF;
    @Column(name="CPF")
    @NotBlank(message="CPF obrigatório")
    @Length(message="CPF com no máximo 11 caracteres",max=11)
    String dataNascimento;
    @Column(dataNascimento="Data de Nascimento")
    @NotBlank
    @

    
    
}
