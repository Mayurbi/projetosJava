package aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Livros;

public class AtualizandoLivro {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("editora-livros");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin(); 

		Livros livros = em.find(Livros.class, 1L);
		
		System.out.println("Valor atual: " + livros.getPreco());
		livros.setPreco(livros.getPreco().add(new BigDecimal(43)));
		System.out.println("Novo preço: " + livros.getPreco());

		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); 
		emf.close();

	}

}
