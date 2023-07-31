package aplicacao.Doacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Doacao;

public class AtualizandoDoacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Doacao doacao = em.find(Doacao.class, 1L);

		System.out.println("Atualizar doador:  " + doacao.getUsuario());
		System.out.println("Atualizar preco:  " + doacao.getPreco());
		System.out.println("Atualizar forma de pagamento:  " + doacao.getFormaPagamento());
		System.out.println("Atualizar organização:  " + doacao.getOrganizacao());
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
