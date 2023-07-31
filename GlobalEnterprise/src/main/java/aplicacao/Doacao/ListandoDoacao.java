package aplicacao.Doacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Doacao;

public class ListandoDoacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Query query = em.createQuery("select D from Doacao D");

		List<Doacao> doacoes = query.getResultList();
		for (Doacao doacao : doacoes) {
			System.out.println(doacao.getId() + " - " + doacao.getPreco() + " - " + doacao.getFormaPagamento() + " - "
					+ doacao.getUsuario() + " - " + doacao.getOrganizacao());

			em.getTransaction().commit();
			em.close();
			emf.close();

		}

	}
}
