package com.brasoft.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brasoft.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
