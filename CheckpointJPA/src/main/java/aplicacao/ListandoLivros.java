package aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Livros;

public class ListandoLivros {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("editora-livros");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Query query = em.createQuery("select l from Livros l");

		@SuppressWarnings("unchecked")
		List<Livros> livro = query.getResultList();
		for (Livros livros : livro) {
			System.out.println(livros.getId() + " - " + livros.getTitulo() + " "
					+ livros.getIsbn() + " - " + livros.getSinopse() + " - " + " - " + livros.getDataPublicacao()
					+ " - " + livros.getGenero());
		}

		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close();
		emf.close();

	}

}
