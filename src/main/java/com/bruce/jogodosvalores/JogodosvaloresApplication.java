package com.bruce.jogodosvalores;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bruce.jogodosvalores.domain.Pergunta;
import com.bruce.jogodosvalores.domain.Resposta;
import com.bruce.jogodosvalores.repositories.PerguntaRepository;
import com.bruce.jogodosvalores.repositories.RespostaRepository;

@SpringBootApplication
public class JogodosvaloresApplication implements CommandLineRunner {
	
	@Autowired
	private PerguntaRepository perguntaRepository;
	
	@Autowired
	private RespostaRepository respostaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JogodosvaloresApplication.class, args);
	}
	
	Pergunta p1 = new Pergunta(null, "Informática");
	Pergunta p2 = new Pergunta(null, "Escritório");
	
	Resposta r1 = new Resposta(null,"Computador", V);
	Resposta r2 = new Resposta(null,"Impressora", F);
	Resposta r3 = new Resposta(null,"Impressora", F);
	Resposta r4 = new Resposta(null,"Mouse", F);

	@Override
	public void run(String... args) throws Exception {
	
	p1.getRespostas().addAll(Arrays.asList(r1,r2,r3,r4));
	
	r1.getPerguntas().addAll(Arrays.asList(p1));
	r2.getPerguntas().addAll(Arrays.asList(p1));
	r3.getPerguntas().addAll(Arrays.asList(p1));
	r4.getPerguntas().addAll(Arrays.asList(p1));
		
	perguntaRepository.saveAll(Arrays.asList(p1,p2));
	respostaRepository.saveAll(Arrays.asList(r1,r2,r3,r4));
	
	}
}
