package com.apicliente.demo.domain.service;

import java.util.List;
import java.util.stream.Collectors;
import com.apicliente.demo.domain.dto.responseDto;
import com.apicliente.demo.domain.dto.clienteDto;
import com.apicliente.demo.domain.entity.cliente;
import com.apicliente.demo.domain.enumeration.Status;
import com.apicliente.demo.domain.repository.clienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class clienteService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private responseDto responseDto;

    clienteRepository clienteRepository;

    public responseDto savecliente(Cliente cliente){
        responseDto.setId(clienteRepository.save(cliente).getId());
        responseDto.setMenssage(setMenssage:"Usuário incluído com sucesso...");
        responseDto.setStatus(Status.SUCCESS.value());
    }

    public List<clienteDto> getAlClienteDTOs(){
        List <clienteDto>

    }
    
}
