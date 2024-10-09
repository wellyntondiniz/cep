package com.ifmt.cep;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

	CepRepository cepRepository;

	public CepService(CepRepository cepRepository) {
		super();
		this.cepRepository = cepRepository;
	}

	public List<Cep> buscarTodos() {
		return cepRepository.findAll();
	}
	
	public Cep inserir(Cep cep) {
		return cepRepository.save(cep);
	}
	
	public void remover(Integer id) {
		Cep cep = cepRepository.findById(id).get();
		cepRepository.delete(cep);
	}
	
	public Cep alterar (Cep cep) {
		return cepRepository.save(cep);
	}
	
}
