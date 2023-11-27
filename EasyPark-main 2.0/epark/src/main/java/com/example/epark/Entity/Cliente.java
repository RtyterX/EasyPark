package com.example.epark.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cliente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String name;
	
	public String email;
	
	public String senha;
	
	public String cpf;
	
	public int idade;

	public Long phone;
	
	
	
	
	public Cliente(Long id, String name, String email, String senha, String cpf, int idade, Long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.idade = idade;
		this.phone = phone;
	}

	
	
	
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}











	public void setId(Long id) {
		this.id = id;
	}











	public String getName() {
		return name;
	}











	public void setName(String name) {
		this.name = name;
	}











	public String getEmail() {
		return email;
	}











	public void setEmail(String email) {
		this.email = email;
	}











	public String getSenha() {
		return senha;
	}











	public void setSenha(String senha) {
		this.senha = senha;
	}











	public String getCpf() {
		return cpf;
	}











	public void setCpf(String cpf) {
		this.cpf = cpf;
	}











	public int getIdade() {
		return idade;
	}











	public void setIdade(int idade) {
		this.idade = idade;
	}











	public Long getPhone() {
		return phone;
	}











	public void setPhone(Long phone) {
		this.phone = phone;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
