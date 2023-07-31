package aplicacao.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class AtualizandoUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 1L);

		System.out.println("Atualizar email: " + usuario.getEmail());
		System.out.println("Atualizar senha: " + usuario.getSenha());
		System.out.println("Atualizar telefone: " + usuario.getTelefone());

		em.getTransaction().commit();
		em.close();
		emf.close();


	}

}
