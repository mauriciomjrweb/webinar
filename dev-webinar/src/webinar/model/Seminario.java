package webinar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Seminario {
	private int id;
	private String nome;
	private int numero;
	private double taxa;
	private List<Instrutor> instrutores;

	public Seminario() {
		this.instrutores = new ArrayList<Instrutor>();
	}

	public Seminario(String nome, int numero, double taxa, List<Instrutor> instrutores) {
		this.nome = nome;
		this.numero = numero;
		this.taxa = taxa;
		this.instrutores = instrutores;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public List<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutores.add(instrutor);
	}

}
