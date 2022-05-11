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

    @Autowired
    private clienteDto clienteDto;

    clienteRepository clienteRepository;

    public List<cliente> getAllclientes() {
        List<cliente> listAllclientes = clienteRepository.findAll();
        return listAllclientes;
    }

    public clienteDto updatecliente(cliente cliente){
        clienteDto.setId(cliente.getId());
        if (clienteRepository.existsById(cliente.getId())) {
            
            clienteRepository.save(cliente);
        } else {
            
        }
        return clienteDto;
    }

    public clienteDto savecliente(cliente cliente) {
        clienteRepository.save(cliente);
        clienteDto.setCPF(cliente.getCpf());
        clienteDto.setDatanascimento(cliente.getDatanascimento());
        clienteDto.setId(cliente.getId());
        clienteDto.setNome(cliente.getNome());
        clienteDto.setSexo(cliente.getSexo());
        return clienteDto;
    }

    public clienteDto deletecliente(Long id) {
        clienteDto.setId(id);
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {

        }
        return clienteDto;
    }
}

