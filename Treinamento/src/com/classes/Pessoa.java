package com.classes;

/* Classe Pai para armazenar informações de pesssoas */

public abstract class Pessoa {

	
	protected String nome;
	protected int idade;
	protected int dataNascimento;
	protected int numeroDoCpf;
	
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getNumeroDoCpf() {
		return numeroDoCpf;
	}
	public void setNumeroDoCpf(int numeroDoCpf) {
		this.numeroDoCpf = numeroDoCpf;
	}
	
	
	
	
}

	

