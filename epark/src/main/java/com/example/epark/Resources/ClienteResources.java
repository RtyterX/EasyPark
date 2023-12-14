package com.example.epark.Resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.epark.Entity.Cliente;

import com.example.epark.Services.ClienteServices;



@RestController
@RequestMapping(value = "/cliente")
public class ClienteResources {
	
	public ClienteServices clienteServices;

	@Autowired
    public ClienteResources(ClienteServices clienteServices) {
		
		this.clienteServices = clienteServices;
		
	}
	
	
	
	@CrossOrigin
	@PostMapping(value = "/insert")
	public ResponseEntity<String> insertCliente(@RequestBody Cliente cliente) {
		clienteServices.saveCliente(cliente);
		return new ResponseEntity<>("Conta criada com Sucesso", HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<List<Cliente>> getTodosCliente(){
		return ResponseEntity.ok(clienteServices.getTodosCliente());
		
	}
	
	
	@CrossOrigin
	@GetMapping(value = "/list/{cpf}")
	public ResponseEntity<Optional<Cliente>> getCliente(@PathVariable String cpf){
		return ResponseEntity.ok(clienteServices.getCliente(cpf));
	}
	
	@CrossOrigin
	@GetMapping(value = "/list-email/{email}")
	public ResponseEntity<Optional<Cliente>> getClienteEmail(@PathVariable String email){
		return ResponseEntity.ok(clienteServices.getClienteByEmail(email));
	}
	
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		clienteServices.deleteCliente(id);
		return ResponseEntity.noContent().build();	
	}
	
	
	@PutMapping(value = "/up/{id}")
	public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente obj) {
		obj = clienteServices.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	

}
