package com.apicliente.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import com.apicliente.demo.domain.dto.clienteDto;
import com.apicliente.demo.domain.entity.cliente;
import com.apicliente.demo.domain.service.clienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/cliente")
public class clienteController {

    @Autowired
    private clienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public clienteDto savecliente(@Valid @RequestBody cliente cliente) {
        return clienteService.savecliente(cliente);
    }


    @PutMapping
    public clienteDto updatedcliente(@Valid @RequestBody cliente cliente){
        return clienteService.updatecliente(cliente);
    }

    @DeleteMapping(value = "/{id}")
    public clienteDto deletecliente(@Valid @PathVariable Long id){
        return clienteService.deletecliente(id);
    }

    @GetMapping(value = "/list")
    public List<cliente> getAllclientes(){
        return clienteService.getAllclientes();
    }
    
}