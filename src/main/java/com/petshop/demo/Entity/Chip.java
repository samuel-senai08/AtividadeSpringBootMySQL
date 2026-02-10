package com.petshop.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chip {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private double codigo;
	private String localcolocacao;
	private String status;
	
	public Chip() {
		
	}
	
	public Chip (double codigo, String localcolocacao, String status) {
		this.codigo = codigo;
		this.localcolocacao = localcolocacao;
		this.status = status;
		
		
	}

	public Long getId() {
		return id;
	}

	public double getCodigo() {
		return codigo;
	}

	public String getLocalcolocacao() {
		return localcolocacao;
	}

	public String getStatus() {
		return status;
	}
	

}
