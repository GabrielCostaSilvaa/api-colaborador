package com.apicolaborador.demo.domain.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class colaboradorDto {
    Long id;
    String Nome; 
    String CPF;
    String setor;
}
