package com.bruce.jogodosvalores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruce.jogodosvalores.domain.Pergunta;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {

}
