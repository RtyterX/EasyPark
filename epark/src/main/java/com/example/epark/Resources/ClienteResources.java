package com.example.epark.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.epark.Entity.Cliente;
import com.example.epark.Services.ClienteServices;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResources {

	@Autowired
	public ClienteServices clienteServices;
	
	@CrossOrigin
	@PostMapping(value = "/insert")
	public ResponseEntity<String> insertCliente(@RequestBody Cliente cliente) {
		clienteServices.saveCliente(cliente);
		return new ResponseEntity<>("Conta criada com Sucesso", HttpStatus.OK);
		
	}
	
	
}
