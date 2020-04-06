package com.bruce.jogodosvalores.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruce.jogodosvalores.domain.Pergunta;
import com.bruce.jogodosvalores.repositories.PerguntaRepository;
import com.bruce.jogodosvalores.services.exceptions.ObjectNotFoundException;

@Service
public class PerguntaService {
	
	@Autowired
	private PerguntaRepository repo;
	
	public Pergunta find(Integer id) {
		Optional<Pergunta> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pergunta.class.getName()));
	}
}
