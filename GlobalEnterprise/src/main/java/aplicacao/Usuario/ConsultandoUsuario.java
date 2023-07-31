package aplicacao.Usuario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class ConsultandoUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		List<Usuario> usuarios = em.createQuery("select U from Usuario U", Usuario.class).getResultList();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getId() + " - " + usuario.getEmail());

		}

	
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
