package com.petshop.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vacinacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private double codigo;
	private int validade;
	private int periodo;
	
	public Vacinacao() {
		
	}
	
	public Vacinacao (double codigo, int validade, int periodo) {
		this.codigo = codigo;
		this.validade = validade;
		this.periodo = periodo;
		
		
	}

	public Long getId() {
		return id;
	}

	public double getCodigo() {
		return codigo;
	}

	public int getValidade() {
		return validade;
	}

	public int getPeriodo() {
		return periodo;
	}

}
