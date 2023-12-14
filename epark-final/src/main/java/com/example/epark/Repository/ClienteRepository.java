package com.example.epark.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.epark.Entity.Cliente;

public interface ClienteRepository extends JpaRepository< Cliente, Long  > {

	Optional<Cliente> findByEmail(String email);
	
}
