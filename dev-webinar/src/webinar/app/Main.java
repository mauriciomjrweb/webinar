package webinar.app;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import webinar.dao.InstrutorDao;
import webinar.dao.JPAUtil;
import webinar.model.Aluno;
import webinar.model.Endereco;
import webinar.model.Formacao;
import webinar.model.InscricaoSeminario;
import webinar.model.Instrutor;
import webinar.model.Seminario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

		/*
		 * Aluno aluno1 = new Aluno("123", "Mauricio", new Endereco("Tupi", "Alfenas"),
		 * "m@m.br"); em.getTransaction().begin(); em.persist(aluno1);
		 * em.getTransaction().commit();
		 * 
		 * Instrutor instrutor1 = new Instrutor("Batman", new Endereco("Tupi",
		 * "Alfenas"), "bat@m.br", 1500, Formacao.JEDI); em.getTransaction().begin();
		 * em.persist(instrutor1); em.getTransaction().commit();
		 * 
		 * List<Instrutor> instrutores = new ArrayList<Instrutor>();
		 * instrutores.add(instrutor1);
		 * 
		 * Seminario semi1 = new Seminario("Palestra Java", 101, 50, instrutores);
		 * em.getTransaction().begin(); em.persist(semi1); em.getTransaction().commit();
		 * 
		 * Aluno alunocon = em.find(Aluno.class, 1); Seminario semicon =
		 * em.find(Seminario.class, 1);
		 * 
		 * InscricaoSeminario inscricao = new InscricaoSeminario(alunocon, semicon);
		 * em.getTransaction().begin(); em.persist(inscricao);
		 * em.getTransaction().commit();
		 */

		/*Seminario semicon1 = em.find(Seminario.class, 1);

		System.out.println(semicon1.getNome());

		for (Instrutor inst : semicon1.getInstrutores()) {
			System.out.println(inst.getNome());
		}*/
		
		List<Instrutor> instrutores = new InstrutorDao().getAllbyFormacao(Formacao.JEDI);
		for (Instrutor instrutor : instrutores) {
			System.out.println(instrutor.getNome());
		}

		JPAUtil.shutdown();

	}

}
