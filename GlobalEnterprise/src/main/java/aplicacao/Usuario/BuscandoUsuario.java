package aplicacao.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class BuscandoUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usu1 = em.find(Usuario.class, 1L);
		System.out.println(usu1.getId() + " - " + usu1.getEmail());

		Usuario usu2 = em.find(Usuario.class, 2L);
		System.out.println(usu2.getId() + " - " + usu2.getEmail());

		
		Usuario usu3 = em.find(Usuario.class, 3L);
		System.out.println(usu3.getId() + " - " + usu3.getEmail());

		
		Usuario usu4 = em.find(Usuario.class, 4L);
		System.out.println(usu4.getId() + " - " + usu4.getEmail());

		
		Usuario usu5 = em.find(Usuario.class, 5L);
		System.out.println(usu5.getId() + " - " + usu5.getEmail());

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
