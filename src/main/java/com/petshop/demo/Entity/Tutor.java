package com.petshop.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int datanascimento;
	
	public Tutor() {
		
	}
	
	public Tutor(String nome, int datanascimento) {
		this.nome = nome;
		this.datanascimento = datanascimento;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(int datanascimento) {
		this.datanascimento = datanascimento;
	}
	

}
