package aplicacao;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Paciente;

public class Programa {

	public static void main(String[] args) {

		// instanciando os objetos para inserir no banco de dados
		Paciente p1 = new Paciente("Paola", 375255230L, "Rua Quadra Quatro", "(95)2335-2343",
				LocalDate.of(2003, 9, 8), "Desenvolvedora", "paolinhagameplay@gmail.com");
		Paciente p2 = new Paciente("Karina", 270888032L, "Rua Borboletas Psicodélicas", "(17)2132-7757",
				LocalDate.of(1995, 8, 25), "Professora", "karininhas2@gmail.com");
		Paciente p3 = new Paciente("Karen", 228096121L, "Rua Jeca Tatu", "(82)3314-3654",
				LocalDate.of(2000, 11, 4), "Médica", "karenzinhas2@gmail.com");
		Paciente p4 = new Paciente("João", 287653316L, "Rua Aliança Liberal", "(11)3543-3152",
				LocalDate.of(1940, 12, 15), "Secretário", "joaozinho123@gmail.com");
		Paciente p5 = new Paciente("Edinaldo", 352096111L, "Travessa Sentimental Demais", "(98)2207-8118",
				LocalDate.of(2003, 1, 27), "Pedreiro", "edinaldinho09@gmail.com");

		// Entity Manager é utilizado para realizar a persistência nos objetos da
		// aplicação
		// EntityManagerFactory é usado configurar e criar uma conexão com o banco de
		// dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-paciente");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.getTransaction().commit();

		System.out.println("Terminando...");
		em.close();
		emf.close();
	}

}