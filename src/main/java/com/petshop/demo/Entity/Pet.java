package com.petshop.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String nome;
	private double tamanho;
	private int datanascimento;
	
	public Pet() {
		
	}
	
	public Pet(String nome, double tamanho, int datanascimento) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.datanascimento = datanascimento;
		
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getTamanho() {
		return tamanho;
	}

	public int getDatanascimento() {
		return datanascimento;
	}
	
	

}
