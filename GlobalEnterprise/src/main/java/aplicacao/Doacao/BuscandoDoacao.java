package aplicacao.Doacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Doacao;



public class BuscandoDoacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Doacao doa1 = em.find(Doacao.class, 11L);
		System.out.println(doa1.getId() + " - " + doa1.getUsuario().getId());
		
		Doacao doa2= em.find(Doacao.class, 12L);
		System.out.println(doa2.getId() + " - " + doa2.getUsuario().getId());
		
		Doacao doa3 = em.find(Doacao.class, 13L);
		System.out.println(doa3.getId() + " - " + doa3.getUsuario().getId());
		
		Doacao doa4 = em.find(Doacao.class, 14L);
		System.out.println(doa4.getId() + " - " + doa4.getUsuario().getId());
		
		Doacao doa5 = em.find(Doacao.class, 15L);
		System.out.println(doa5.getId() + " - " + doa5.getUsuario().getId());

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
