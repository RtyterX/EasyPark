package com.example.epark.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.epark.Entity.Agendamento;
import com.example.epark.Repository.AgendamentoRepository;

@Service
public class AgendamentoServices {
	
	private AgendamentoRepository agendamentoRepository;
	
	@Autowired
	public AgendamentoServices(AgendamentoRepository agendamentoRepository) {
		this.agendamentoRepository = agendamentoRepository;
	}
	
	public Agendamento saveAgendamento(Agendamento agendamento) {
		return agendamentoRepository.save(agendamento);
	}
	
	public void deleteAgendamento(Long id) {
		agendamentoRepository.deleteById(id);
	}
	
	public List<Agendamento> getTodosAgendamentos(){
		return agendamentoRepository.findAll();
	}
	
	public Agendamento update(Long id, Agendamento agendamento) {
		if (agendamentoRepository.existsById(id)) {
			agendamento.setId(id);
			return agendamentoRepository.save(agendamento);
		} else {
			throw new IllegalArgumentException("Agendamento " + id + " não existe" );
		}
	}

}
