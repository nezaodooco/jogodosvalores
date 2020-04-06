package com.bruce.jogodosvalores.domain.enums;

public enum Validacao {
	
	VERDADEIRO(1,"Verdadeiro"),
	FALSO(2,"Falso");
	
	private Integer cod;
	private String descricao;
	
	private Validacao(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public Integer getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Validacao toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(Validacao x : Validacao.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
