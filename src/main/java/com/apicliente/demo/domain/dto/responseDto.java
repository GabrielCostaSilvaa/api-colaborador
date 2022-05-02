package com.apicliente.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class responseDto {
    private Long id;
    private int  status;
    private String menssage;
}
