package com.brasoft.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brasoft.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
