package com.apicliente.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class clienteDto {
    Long id;
    String Nome; 
    String CPF;
    String dataNascimento;
}
