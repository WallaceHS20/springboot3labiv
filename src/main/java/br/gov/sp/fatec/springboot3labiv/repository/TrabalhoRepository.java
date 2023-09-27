package br.gov.sp.fatec.springboot3labiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3labiv.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{


    
}
