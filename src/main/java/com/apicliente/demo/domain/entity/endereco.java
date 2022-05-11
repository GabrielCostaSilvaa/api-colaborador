package com.apicliente.demo.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "enderecos")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cep")
    @NotBlank
    private String cep;

    @Column(name = "rua")
    @NotBlank
    private String rua;

    @Column(name = "bairro")
    @NotBlank
    private String bairro;
    
    @Column(name = "numero")
    @NotNull
    private Integer numero;
    
    @Column(name = "cidade")
    @NotBlank
    private String cidade;

    @Column(name = "uf")
    @NotBlank
    private String uf;

    @OneToOne(mappedBy = "endereco")
    private cliente cliente;
    
}
