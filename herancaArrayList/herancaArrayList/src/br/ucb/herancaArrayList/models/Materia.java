package br.ucb.herancaArrayList.models;

import java.util.ArrayList;

public class Materia {
	private String nome;
	private int cargaHoraria;
	private int creditos;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	
	public Materia(String nome, int ch, int creditos) {
		setNome(nome);
		setCargaHoraria(ch);
		setCreditos(creditos);
		setAlunos(new ArrayList<Aluno>());
		setProfessores(new ArrayList<Professor>());
	}

	private String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	private int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	private ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	private ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	
}
