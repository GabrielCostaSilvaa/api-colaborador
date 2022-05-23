package com.apicolaborador.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import com.apicolaborador.demo.domain.dto.colaboradorDto;
import com.apicolaborador.demo.domain.entity.colaborador;
import com.apicolaborador.demo.domain.service.colaboradorService;

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
@RequestMapping("/colaborador")
public class colaboradorController {

    @Autowired
    private colaboradorService colaboradorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public colaboradorDto savecolaborador(@Valid @RequestBody colaborador colaborador) {
        return colaboradorService.savecolaborador(colaborador);
    }


    @PutMapping
    public colaboradorDto updatedcolaborador(@Valid @RequestBody colaborador colaborador){
        return colaboradorService.updatecolaborador(colaborador);
    }

    @DeleteMapping(value = "/{id}")
    public colaboradorDto deletecolaborador(@Valid @PathVariable Long id){
        return colaboradorService.deletecolaborador(id);
    }

    @GetMapping(value = "/list")
    public List<colaborador> getAllcolaboradors(){
        return colaboradorService.getAllcolaboradors();
    }
    
}