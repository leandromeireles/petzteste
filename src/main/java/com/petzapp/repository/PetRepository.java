package com.petzapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petzapp.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
	
	Pet findById(long id);
}
