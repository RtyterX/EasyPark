package com.example.epark.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.epark.Entity.Vagas;
import com.example.epark.Repository.VagasRepository;

@Service
public class VagasServices {
	
	private VagasRepository vagasRepository;
	
	@Autowired
	public VagasServices(VagasRepository vagasRepository) {
		this.vagasRepository = vagasRepository;
	}
	
	public Vagas saveVagas(Vagas vagas) {
		return vagasRepository.save(vagas);
	}
	
	public void deleteVagas(Long id) {
		vagasRepository.deleteById(id);
	}
	
	public List<Vagas> getTodasVagas(){
		return vagasRepository.findAll();
	}
	
	public Vagas update(long id, Vagas vagas) {
		if (vagasRepository.existsById(id)) {
			vagas.setId(id);
			return vagasRepository.save(vagas);
		} else {
			throw new IllegalArgumentException("A Vaga " +id+ "não existe");
		}
	}
	

}
