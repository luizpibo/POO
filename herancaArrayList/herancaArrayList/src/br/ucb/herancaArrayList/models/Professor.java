package br.ucb.herancaArrayList.models;

/*Import */
import java.time.LocalDate;
import java.util.ArrayList;

/*Class */
public class Professor extends Pessoa{
	/*Atributos */
	private ArrayList<Curso> cursos;
	private LocalDate dataContratacao;
	
	/*Construtor*/
	public Professor(String nome, LocalDate nascimento, String cpf) {
		super(nome, nascimento, cpf);
		setDataContratacao(LocalDate.now());
	}

	private ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	private LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
}
