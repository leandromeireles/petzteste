package com.petzapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petzapp.models.Cliente;

public interface PetzRepository extends JpaRepository<Cliente, Long> {
	
	Cliente findById(long codigo);
}
