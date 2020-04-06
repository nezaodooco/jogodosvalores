package com.bruce.jogodosvalores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruce.jogodosvalores.domain.Resposta;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Integer> {

}