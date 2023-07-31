package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Conta;

public class AtualizandoBanco {
	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-banco");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // há a necessidade de se fazer uma transação ao inserir algo no bd

		Conta c1 = em.find(Conta.class, 1L);
		
//		System.out.println("Valor atual: " + veiculo.getValor());
//		veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
//		System.out.println("Novo valor: " + veiculo.getValor());

		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();
	}

}
