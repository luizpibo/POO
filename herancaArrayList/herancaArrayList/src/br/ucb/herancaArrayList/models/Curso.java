package br.ucb.herancaArrayList.models;

import java.util.ArrayList;

import br.ucb.herancaArrayList.utils.Utils;

public class Curso {
	private String nome;
	private ArrayList<Materia> materias;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	
	public Curso(String nome) {
		setNome(nome);
		setMaterias(new ArrayList<Materia>());
		setAlunos(new ArrayList<Aluno>());
		setProfessores(new ArrayList<Professor>());
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	private void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	private void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	private void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	
	boolean adicionarMateria() {
		Materia m =	new Materia(
				Utils.lerEValidaStringVazia("Digite o nome da materia: "),
				Utils.lerEValidaInteiro("Qual a carga horária: ", 20, 120),
				Utils.lerEValidaInteiro("Quantos creditos a materia tem: ", 20, 80));
		if(m == null) {
			System.out.println("/nFALHA NO CADASTRO DE MATERIA !/n");
			return false;
		}else {
			System.out.println("Materia cadastrada com sucesso !!");
			getMaterias().add(m);
			return true;
		}
	}
}
