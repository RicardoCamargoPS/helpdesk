package com.brasoft.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brasoft.helpdesk.domain.Chamado;
import com.brasoft.helpdesk.domain.Cliente;
import com.brasoft.helpdesk.domain.Tecnico;
import com.brasoft.helpdesk.enums.Perfil;
import com.brasoft.helpdesk.enums.Prioridade;
import com.brasoft.helpdesk.enums.Status;
import com.brasoft.helpdesk.repositories.ChamadoRepository;
import com.brasoft.helpdesk.repositories.ClienteRepository;
import com.brasoft.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "123456", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.TECNICO);
		Cliente cli1 = new Cliente(null, "Leonardo Silva", "654321", "leonardo@mail.com", "123");
		cli1.addPerfil(Perfil.CLIENTE);
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
