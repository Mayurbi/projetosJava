package aplicacao.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class ExcluindoUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Usuario usu1 = em.find(Usuario.class, 1L);
		Usuario usu2 = em.find(Usuario.class, 2L);
		Usuario usu3 = em.find(Usuario.class, 3L);
		Usuario usu4 = em.find(Usuario.class, 4L);
		Usuario usu5 = em.find(Usuario.class, 5L);

		em.remove(usu1);
		em.remove(usu2);
		em.remove(usu3);
		em.remove(usu4);
		em.remove(usu5);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
