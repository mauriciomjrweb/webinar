package webinar.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import webinar.dao.JPAUtil;
import webinar.model.Aluno;
import webinar.model.Endereco;
import webinar.model.Formacao;
import webinar.model.Instrutor;
import webinar.model.Seminario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		/*Endereco end1 = new Endereco();
		end1.setRua("Rua Jose");
		end1.setCidade("Alfenas");

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Poderoso Eder");
		aluno1.setMatricula("1234");
		aluno1.setEmail("eder@unifenas.br");
		//!!!
		aluno1.setEndereco(end1);
		
		em.getTransaction().begin();
		em.persist(end1);
		em.persist(aluno1);
		em.getTransaction().commit();
		*/
		
		/*Aluno aluno2 = new Aluno("1234", "Lucas", new Endereco("Rua 123", "Alfenas"), "lucas@unifenas.br");
		em.getTransaction().begin();
		em.persist(aluno2);
		em.getTransaction().commit();*/
		
		Instrutor inst1 = new Instrutor("Batman", new Endereco("Rua 123", "Alfenas"), 
				"bat@unifenas.br", 1000, Formacao.JEDI);
		Instrutor inst2 = new Instrutor("Tony Stark", new Endereco("Rua 123", "Alfenas"), 
				"stark@unifenas.br", 1000, Formacao.GRADUADO);
		em.getTransaction().begin();
		em.persist(inst1);
		em.persist(inst2);
		em.getTransaction().commit();
		
		List<Instrutor>	instrutores = new ArrayList();
		instrutores.add(inst1);
		instrutores.add(inst2);
		
		Seminario semi1 = new Seminario("Palestra Java", 101, 50, instrutores);
		em.getTransaction().begin();
		em.persist(semi1);
		em.getTransaction().commit();
		
		JPAUtil.shutdown();

	}

}
