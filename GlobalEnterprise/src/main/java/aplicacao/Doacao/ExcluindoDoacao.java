package aplicacao.Doacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Doacao;

public class ExcluindoDoacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Doacao doa1 = em.find(Doacao.class, 11L);
		Doacao doa2 = em.find(Doacao.class, 12L);
		Doacao doa3 = em.find(Doacao.class, 13L);
		Doacao doa4 = em.find(Doacao.class, 14L);
		Doacao doa5 = em.find(Doacao.class, 15L);
		em.remove(doa1);
		em.remove(doa2);
		em.remove(doa3);
		em.remove(doa4);
		em.remove(doa5);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
