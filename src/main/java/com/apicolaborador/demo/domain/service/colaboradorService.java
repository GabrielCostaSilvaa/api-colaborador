package com.apicolaborador.demo.domain.service;

import java.util.List;
import java.util.stream.Collectors;
import com.apicolaborador.demo.domain.dto.responseDto;
import com.apicolaborador.demo.domain.dto.colaboradorDto;
import com.apicolaborador.demo.domain.entity.colaborador;
import com.apicolaborador.demo.domain.enumeration.status;
import com.apicolaborador.demo.domain.repository.colaboradorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class colaboradorService {
    
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private responseDto responseDto;

    @Autowired
    private colaboradorDto colaboradorDto;

    colaboradorRepository colaboradorRepository;

    public List<colaborador> getAllcolaboradors() {
        List<colaborador> listAllcolaboradors = colaboradorRepository.findAll();
        return listAllcolaboradors;
    }

    public colaboradorDto updatecolaborador(colaborador colaborador){
        colaboradorDto.setId(colaborador.getId());
        if (colaboradorRepository.existsById(colaborador.getId())) {
            
            colaboradorRepository.save(colaborador);
        } else {
            
        }
        return colaboradorDto;
    }

    public colaboradorDto savecolaborador(colaborador colaborador) {
        colaboradorRepository.save(colaborador);
        colaboradorDto.setCPF(colaborador.getCpf());
        colaboradorDto.setId(colaborador.getId());
        colaboradorDto.setNome(colaborador.getNome());
        colaboradorDto.setSetor(colaborador.getSetor());
        return colaboradorDto;
    }

    public colaboradorDto deletecolaborador(Long id) {
        colaboradorDto.setId(id);
        if (colaboradorRepository.existsById(id)) {
            colaboradorRepository.deleteById(id);
        } else {

        }
        return colaboradorDto;
    }
}

