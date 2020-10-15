package webinar.model;

import java.util.List;


public class Aluno {
	private int id;
	private String matricula;
	private String nome;
	private Endereco endereco;
	private String email;

	public Aluno() {
	}

	public Aluno(String matricula, String nome, Endereco endereco, String email) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
