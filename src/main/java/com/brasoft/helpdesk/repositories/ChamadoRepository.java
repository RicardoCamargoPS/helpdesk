package com.brasoft.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brasoft.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
