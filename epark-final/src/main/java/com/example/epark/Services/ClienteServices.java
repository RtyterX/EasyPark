package com.example.epark.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.epark.Entity.Cliente;
import com.example.epark.Repository.ClienteRepository;

@Service
public class ClienteServices {

	private ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteServices(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
		
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public List<Cliente> getTodosCliente(){
		return clienteRepository.findAll();
	}
	
	public Optional<Cliente> getCliente(String email){
		return clienteRepository.findByEmail(email);
	}
	
	public Cliente update(long id, Cliente cliente) {
		if (clienteRepository.existsById(id)) {
			cliente.setId(id);
			return clienteRepository.save(cliente);
		} else {
			throw new IllegalArgumentException("Cliente " + id + " não existe" );
		}
	}
}
