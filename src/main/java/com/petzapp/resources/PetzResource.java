package com.petzapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petzapp.models.Cliente;
import com.petzapp.models.Pet;
import com.petzapp.repository.ClienteRepository;
import com.petzapp.repository.PetRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST CLIENTES PETZ")
@CrossOrigin(origins="*")
public class PetzResource {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	PetRepository petRepository;

	@GetMapping("/clientes")
	@ApiOperation(value="Retorna Lista de Clientes")
	public List<Cliente> listaClientes() {

		return clienteRepository.findAll();

	}

	@GetMapping("/clientes/{id}")
	@ApiOperation(value="Retorna Clientes Unico")
	public Cliente listaClienteUnico(@PathVariable(value = "id") long id) {

		return clienteRepository.findById(id);

	}

	@PostMapping("/cliente")
	@ApiOperation(value="Salva um Cliente")
	public Cliente salvaCliente(@RequestBody Cliente cliente) {

		return clienteRepository.save(cliente);

	}
	
	@DeleteMapping("/cliente")
	@ApiOperation(value="Deleta um Cliente")
	public void deletaCliente(@RequestBody Cliente cliente) {

		clienteRepository.delete(cliente);

	}
	
	@PutMapping("/cliente")
	@ApiOperation(value="Atualiza um Cliente")
	public Cliente atualizaCliente(@RequestBody Cliente cliente) {

		return clienteRepository.save(cliente);

	}
	
	@GetMapping("/pets")
	@ApiOperation(value="Retorna Lista de Pets")
	public List<Pet> listaPets() {

		return petRepository.findAll();

	}

	@GetMapping("/pets/{id}")
	@ApiOperation(value="Retorna Pet Unico")
	public Pet listaPetUnico(@PathVariable(value = "id") long id) {

		return petRepository.findById(id);

	}

	@PostMapping("/pet")
	@ApiOperation(value="Salva um Pet")
	public Pet salvaPet(@RequestBody Pet pet) {

		return petRepository.save(pet);

	}
	
	@DeleteMapping("/pet")
	@ApiOperation(value="Deleta um Pet")
	public void deletaPet(@RequestBody Pet pet) {

		petRepository.delete(pet);

	}
	
	@PutMapping("/pet")
	@ApiOperation(value="Atualiza um Pet")
	public Pet atualizaPet(@RequestBody Pet pet) {

		return petRepository.save(pet);

	}
	
}
