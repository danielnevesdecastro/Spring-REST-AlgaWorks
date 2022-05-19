package com.algaworks.listas;

public class Cliente {
	// variáveis de instância
	private Long id;
	private String nome;
	
	// Source >> generate constructors 
	public Cliente(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	//Source >> generete Getters e setter >> getters 
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
 
}
