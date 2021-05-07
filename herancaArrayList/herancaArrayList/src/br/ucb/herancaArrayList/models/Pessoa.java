package br.ucb.herancaArrayList.models;

/*Imports*/
import java.time.LocalDate;

/*Class*/
public abstract class Pessoa {
	/*Atributos*/
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	
	/*Construtor*/
	protected Pessoa(String nome, LocalDate date, String cpf) {
		setNome(nome);
		setDataNascimento(date);
		setCpf(cpf);
	}
	
	/*Gets and sets*/
	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	private void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
