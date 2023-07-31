package aplicacao.Doacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Doacao;

public class ConsultandoDoacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		List<Doacao> doacoes = em.createQuery("select D from Doacao D", Doacao.class).getResultList();
		for (Doacao doacao : doacoes) {
			System.out.println(doacao.getId() + " - " + doacao.getUsuario());

		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}
}
