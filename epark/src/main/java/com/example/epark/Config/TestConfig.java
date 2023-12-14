package com.example.epark.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.epark.Entity.Agendamento;
import com.example.epark.Entity.Cliente;
import com.example.epark.Entity.Vagas;
import com.example.epark.Repository.AgendamentoRepository;
import com.example.epark.Repository.ClienteRepository;
import com.example.epark.Repository.VagasRepository;





@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private VagasRepository vagasRepository;
	
	@Autowired 
	private AgendamentoRepository agendamentoRepository;
	
	

	
	@Override
	public void run(String... args) throws Exception {
		
		
		Cliente c1 = new Cliente(null,"Robert","email@gmail.com","131846","1465495161984",25,"1654646136");
		Cliente c2 = new Cliente(null,"Igor","putaodoita@gmail.com","131846","146547844161984",25,"16545496136");
		Cliente c3 = new Cliente(null,"Daniel","Daniel@gmail.com","131846","1465158844161984",25,"1654635986136");
		
		
		Vagas a1 = new Vagas(null,"a1");
		Vagas a2 = new Vagas(null,"a2");
		Vagas a3 = new Vagas(null,"a3");
		Vagas a4 = new Vagas(null,"a4");
		Vagas a5 = new Vagas(null,"a5");
		Vagas a6 = new Vagas(null,"a6");
		Vagas a7 = new Vagas(null,"a7");
		Vagas a8 = new Vagas(null,"a8");
		Vagas a9 = new Vagas(null,"a9");
		Vagas a10 = new Vagas(null,"a10");
		Vagas a11 = new Vagas(null,"a11");
		Vagas a12 = new Vagas(null,"a12");
		Vagas a13 = new Vagas(null,"a13");
		Vagas a14 = new Vagas(null,"a14");
		Vagas a15 = new Vagas(null,"a15");
		Vagas a16 = new Vagas(null,"a16");
		Vagas a17 = new Vagas(null,"a17");
		Vagas a18 = new Vagas(null,"a18");
		Vagas a19 = new Vagas(null,"a19");
		Vagas a20 = new Vagas(null,"a20");
		
		
		Agendamento b1 = new Agendamento(null,"Rua Itatinga 69","13/12/2023 19:28",c1, a2);
		Agendamento b2 = new Agendamento(null,"Rua Itatinga 69","13/12/2023 19:28",c2,a5);
		Agendamento b3 = new Agendamento(null,"Rua Itatinga 69","13/12/2023 19:28",c3,a10);
		
		clienteRepository.saveAll(Arrays.asList(c1,c2, c3));
		vagasRepository.saveAll(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20));
		agendamentoRepository.saveAll(Arrays.asList(b1,b2,b3));
		
		

	}
	
	
	

}