package br.gov.sp.fatec.springboot3labiv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3labiv.entity.Trabalho;
import br.gov.sp.fatec.springboot3labiv.repository.TrabalhoRepository;

@Service
public class TrabalhoService {
    
    @Autowired
    private TrabalhoRepository trabalhoRepo;

    /*
    public buscarPorTituloNota (String titulo, Long nota){

        
        if (titulo != null && ) 
        
    }

    */

    public List<Trabalho> BuscarAll(){
        return trabalhoRepo.findAll();
    }
}
