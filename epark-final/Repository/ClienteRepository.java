package com.example.epark.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.epark.Entity.Cliente;

public interface ClienteRepository extends JpaRepository< Cliente, Long  > {

}
