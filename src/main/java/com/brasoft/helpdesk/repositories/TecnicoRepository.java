package com.brasoft.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brasoft.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
