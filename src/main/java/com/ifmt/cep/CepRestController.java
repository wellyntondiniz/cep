package com.ifmt.cep;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/cep")
public class CepRestController {

	@Autowired
	CepService cepService;
	
	@GetMapping
	public List<Cep> buscarTodos() {
		return cepService.buscarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody Cep cep) {
		cepService.inserir(cep);
	}
	
	@DeleteMapping(value = "{id}")
	public void remover(@PathVariable Integer id) {
		cepService.remover(id);
	}
	
	@PutMapping
	public Cep alterar(@RequestBody Cep cep) {
		return cepService.alterar(cep);
	}
	
}
