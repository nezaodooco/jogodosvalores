package com.bruce.jogodosvalores;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bruce.jogodosvalores.domain.Pergunta;
import com.bruce.jogodosvalores.domain.Resposta;
import com.bruce.jogodosvalores.domain.enums.Validacao;
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
	
	Pergunta p1 = new Pergunta(null, "Qual desses é um Valor da Linea Brasil?");
	Pergunta p2 = new Pergunta(null, "Qual desses comportamentos pertencem ao Valor JOGAMOS LIMPO");
	
	/*Respostas da Pergunta 1*/
	Resposta r1 = new Resposta(null,"PESSOAS EM PRIMEIRO LUGAR", Validacao.VERDADEIRO);
	Resposta r2 = new Resposta(null,"JOGAMOS SUJO", Validacao.FALSO);
	Resposta r3 = new Resposta(null,"NÃO ROUBAR", Validacao.FALSO);
	Resposta r4 = new Resposta(null,"LIMPEZA EM PRIMEIRO LUGAR", Validacao.FALSO);
	
	
	/*Respostas da Pergunta 2*/
	Resposta r5 = new Resposta(null,"FALSO", Validacao.FALSO);
	Resposta r6 = new Resposta(null,"FALSO", Validacao.FALSO);
	Resposta r7 = new Resposta(null,"VERDADEIRO", Validacao.VERDADEIRO);
	Resposta r8 = new Resposta(null,"FALSO", Validacao.FALSO);

	@Override
	public void run(String... args) throws Exception {
	
		/*Perguntas*/
		p1.getRespostas().addAll(Arrays.asList(r1,r2,r3,r4));
		p2.getRespostas().addAll(Arrays.asList(r5,r6,r7,r8));
		
		/*Respostas da Pergunta 1*/
		r1.getPerguntas().addAll(Arrays.asList(p1));
		r2.getPerguntas().addAll(Arrays.asList(p1));
		r3.getPerguntas().addAll(Arrays.asList(p1));
		r4.getPerguntas().addAll(Arrays.asList(p1));
		
		/*Respostas da Pergunta 2*/
		r5.getPerguntas().addAll(Arrays.asList(p2));
		r6.getPerguntas().addAll(Arrays.asList(p2));
		r7.getPerguntas().addAll(Arrays.asList(p2));
		r8.getPerguntas().addAll(Arrays.asList(p2));
		
		/*Implementação de perguntas*/
		perguntaRepository.saveAll(Arrays.asList(p1,p2));
		
		/*Implementação de respostas*/
		respostaRepository.saveAll(Arrays.asList(r1,r2,r3,r4,r5,r6,r7,r8));
	
	}
}
