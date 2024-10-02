package com.ifmt.cep;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

	@Autowired
	CepRepository cepRepository;
	
	public List<Cep> buscarTodos() {
		return cepRepository.findAll();
	}
	
}
