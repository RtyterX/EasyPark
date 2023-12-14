package com.example.epark.Entity;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "tb_agendamento")
public class Agendamento implements Serializable{
	private static final long serialVersionUID = 1L;
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String endereco;
	
	private String data;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente; 
	
	
	
	@ManyToOne
	@JoinColumn(name = "id_vagas")
	private Vagas vagas;
	
	
    public Agendamento() {
    	
    }
   
	public Agendamento(Long id, String endereco, String data, Cliente cliente, Vagas vagas) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.data = data;
		this.cliente = cliente;
		this.vagas = vagas;
	}
	


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setVagas(Vagas vagas) {
		this.vagas = vagas;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(id, other.id);
	} 
	
	
	

}
