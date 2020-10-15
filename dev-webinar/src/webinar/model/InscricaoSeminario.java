package webinar.model;

public class InscricaoSeminario {

	private int id;
	private Aluno aluno;
	private Seminario seminario;
	private String datainscricao;

	public InscricaoSeminario() {
	}

	public InscricaoSeminario(Aluno aluno, Seminario seminario) {
		this.aluno = aluno;
		this.seminario = seminario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}

	public String getDatainscricao() {
		return datainscricao;
	}

	public void setDatainscricao(String datainscricao) {
		this.datainscricao = datainscricao;
	}

}