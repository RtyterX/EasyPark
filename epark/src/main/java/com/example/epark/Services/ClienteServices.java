package com.example.epark.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.epark.Entity.Cliente;
import com.example.epark.Repository.ClienteRepository;

@Service
public class ClienteServices {

	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
		
	}
	
	public void delete(Long id) {
		clienteRepository.deleteById(id);
	}
	
}
