package com.petshop.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Raca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String origem;
	
	public Raca() {
		
	}
	
	public Raca (String nome, String origem) {
		this.nome = nome;
		this.origem = origem;
		
		
	}

	public String getNome() {
		return nome;
	}

	public String getOrigem() {
		return origem;
	}
	
	

	
}
