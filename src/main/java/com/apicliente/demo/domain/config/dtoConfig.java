package com.apicliente.demo.domain.config;

import com.apicliente.demo.domain.dto.responseDto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class dtoConfig {
    
    @Bean
    public responseDto responseDto(){
        return new responseDto();
    }
}
