package com.epark.eparkweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epark.eparkweb.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
