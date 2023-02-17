package com.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {

	/* Informações do aluno */

	private int dataMatricula;
	private int ra;
	private int serieMatriculado;

	/* Lista De Disciplinas do aluno */
	private List<Disciplinas> disciplina = new ArrayList<Disciplinas>();

	public List<Disciplinas> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplinas> disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno() {/* Cria Dados Na Memoria */

	}

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

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(int dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public int getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(int serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/* Calculo da nota media do aluno */

	public double notaMedia() {

		double somaNota = 0.0;

		for (Disciplinas disciplinas : disciplina) {

			somaNota += disciplinas.getNota();
		}
		return somaNota / disciplina.size();

	}

	/* Verificação da aprovação do aluno */

	public String getAlunoAprovado() {

		double media = this.notaMedia();
		if (media >= 70) {
			return "Aluno Aprovado";
		} else if (media >= 40 && media <= 69) {
			return "Aluno de Recuperação";
		} else if (media <= 39) {
			return "Aluno Reprovado";
		}
		return getAlunoAprovado();

	}

	/* Verificando uma comparação entre os ra dos alunos */

	@Override
	public int hashCode() {
		return Objects.hash(ra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return ra == other.ra;
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
