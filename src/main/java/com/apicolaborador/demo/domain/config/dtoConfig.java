package com.apicolaborador.demo.domain.config;

import com.apicolaborador.demo.domain.dto.responseDto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class dtoConfig {
    
    @Bean
    public responseDto responseDto(){
        return new responseDto();
    }
}
