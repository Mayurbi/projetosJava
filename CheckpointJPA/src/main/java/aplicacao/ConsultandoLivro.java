package aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import dominio.Livros;

public class ConsultandoLivro {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("editora-livros");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		List<Livros> livro = em.createQuery("select l from Livro l", Livros.class).getResultList();
		for (Livros livros : livro) {
		System.out.println(livros.getTitulo()); //livros.getEditora().getNome());

		}

		em.getTransaction().commit();
		System.out.println("pronto!");
		em.close();
		emf.close();

	}

}
