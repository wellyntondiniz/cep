package com.ifmt.cep;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
