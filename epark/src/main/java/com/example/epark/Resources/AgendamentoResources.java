package com.example.epark.Resources;

import java.util.List;

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

import com.example.epark.Entity.Agendamento;
import com.example.epark.Services.AgendamentoServices;

@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoResources {
	
	public AgendamentoServices agendamentoServices;
	
	@Autowired
	public AgendamentoResources(AgendamentoServices agendamentoServices) {
		this.agendamentoServices = agendamentoServices;
	}
	
	@CrossOrigin
	@PostMapping(value = "/insert")
	public ResponseEntity<String> insertAgendamento(@RequestBody Agendamento agendamento) {
		agendamentoServices.saveAgendamento(agendamento);
		return new ResponseEntity<>("Conta criada com Sucesso", HttpStatus.OK);
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<List<Agendamento>> getTodosAgendamentos(){
		return ResponseEntity.ok(agendamentoServices.getTodosAgendamentos());
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		agendamentoServices.deleteAgendamento(id);
		return ResponseEntity.noContent().build();	
	}
	
	@PutMapping(value = "/up/{id}")
	public ResponseEntity<Agendamento> update(@PathVariable Long id, @RequestBody Agendamento obj) {
		obj = agendamentoServices.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
