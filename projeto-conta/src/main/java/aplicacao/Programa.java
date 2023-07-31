package aplicacao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Conta;
import dominio.IdConta;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(new IdConta("270888032","4343324"),"Paola Mendes Bernardes",19,"bernardeslola@gmail.com","3456", 445043);
		Conta conta2 = new Conta(new IdConta("375255230","5343434"),"Karen Antiqueira",18,"Antiqueirakaka@gmail.com","5456", 20663);
		Conta conta3 = new Conta(new IdConta("287653316","55343434"),"Karen Antiqueira",21,"Antiqueirakaka@gmail.com","2256", 205443);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-banco");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(conta1);
		em.persist(conta2);
		em.persist(conta3);
		
		Conta c = em.find(Conta.class, 2);
		System.out.println(c);

		em.getTransaction().commit();

		System.out.println("Terminando...");
		em.close();
		emf.close();
	}

}
