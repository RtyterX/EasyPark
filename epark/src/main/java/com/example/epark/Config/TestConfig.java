package com.example.epark.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.epark.Entity.Cliente;
import com.example.epark.Repository.ClienteRepository;





@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private Cliente cliente;
	
	
	

	
	@Override
	public void run(String... args) throws Exception {
		
		
		Cliente c1 = new Cliente(null,"Robert","email@gmail.com","131846","1465495161984",25,"1654646136");
		Cliente c2 = new Cliente(null,"Igor","putaodoita@gmail.com","131846","146547844161984",25,"16545496136");
		Cliente c3 = new Cliente(null,"Daniel","Daniel@gmail.com","131846","1465158844161984",25,"1654635986136");
		
		
		clienteRepository.saveAll(Arrays.asList(c1,c2, c3));
		
		

	}

}