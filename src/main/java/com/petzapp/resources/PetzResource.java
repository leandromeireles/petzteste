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
import com.petzapp.repository.PetzRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST CLIENTES PETZ")
@CrossOrigin(origins="*")
public class PetzResource {

	@Autowired
	PetzRepository petzRepository;

	@GetMapping("/clientes")
	@ApiOperation(value="Retorna Lista de Clientes")
	public List<Cliente> listaClientes() {

		return petzRepository.findAll();

	}

	@GetMapping("/clientes/{codigo}")
	@ApiOperation(value="Retorna Clientes Unico")
	public Cliente listaClienteUnico(@PathVariable(value = "codigo") long codigo) {

		return petzRepository.findById(codigo);

	}

	@PostMapping("/cliente")
	@ApiOperation(value="Salva um Cliente")
	public Cliente salvaCliente(@RequestBody Cliente cliente) {

		return petzRepository.save(cliente);

	}
	
	@DeleteMapping("/cliente")
	@ApiOperation(value="Deleta um Cliente")
	public void deletaCliente(@RequestBody Cliente cliente) {

		petzRepository.delete(cliente);

	}
	
	@PutMapping("/cliente")
	@ApiOperation(value="Atualiza um Cliente")
	public Cliente atualizaCliente(@RequestBody Cliente cliente) {

		return petzRepository.save(cliente);

	}
	
}
