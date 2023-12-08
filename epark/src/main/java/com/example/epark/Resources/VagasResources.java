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

import com.example.epark.Entity.Vagas;
import com.example.epark.Services.VagasServices;

@RestController
@RequestMapping (value = "/vagas")
public class VagasResources {
	
	public VagasServices vagasServices;
	
	@Autowired
	public VagasResources(VagasServices vagasServices) {
		this.vagasServices = vagasServices;
	}
	
	@CrossOrigin
	@PostMapping(value = "/insert")
	public ResponseEntity<String> insertVagas(@RequestBody Vagas vagas) {
		vagasServices.saveVagas(vagas);
		return new ResponseEntity<>("Vaga adicionada!", HttpStatus.OK);
	}
	
	@GetMapping(value = "/lista")
	public ResponseEntity<List<Vagas>> getTodosVagas(){
		return ResponseEntity.ok(vagasServices.getTodasVagas());
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		vagasServices.deleteVagas(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/up/{id}")
	public ResponseEntity<Vagas> update(@PathVariable Long id, @RequestBody Vagas obj) {
		obj = vagasServices.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}	
	
	
	
	

}
