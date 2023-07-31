package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Livros;

public class BuscandoLivro {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("editora-livros");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Livros livros = em.find(Livros.class, 2L);
		System.out.println("O codigo desse livro � " + livros.getId() + "e o titulo dele � " + livros.getTitulo());

		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close();
		emf.close();

	}

}
