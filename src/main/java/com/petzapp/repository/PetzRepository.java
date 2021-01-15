package com.petzapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.petzapp.models.Cliente;

public interface PetzRepository extends CrudRepository<Cliente, String> {
	
}
