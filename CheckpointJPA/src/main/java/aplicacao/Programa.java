package aplicacao;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Editora;
import dominio.Genero;
import dominio.Livros;

public class Programa {

	public static void main(String[] args) {
	
//		Livros l1 = new Livros(1L,"A rainha vermelha","5327895436723","Rainha que tem sangue vermelho, luta contra reinado com sangue prateado",LocalDate.of(2016, 7, 9),Genero.FANTASIA,BigDecimal.valueOf(45),new Editora(45L,"Intreseco","41873953","Luta pelas mulheres","Rua abobrinha"));
//		Livros l2 = new Livros(2L,"Cortes e espinhos","5157895433423","História de Feyre, uma humana que vive na extrema pobreza e tem que se virar sozinha para sustentar suas duas irmãs e seu pai.",LocalDate.of(2020, 5, 23),Genero.ACAO,BigDecimal.valueOf(55), new Editora(50L,"Suma","41845653","Luta contra racismo","Rua Casadatia"));
//		Livros l3 = new Livros(3L,"Todo dia","5321495445623","Todo dia, Pedro troca de corpo como se fosse uma entidade",LocalDate.of(2013, 6, 10),Genero.ROMANCE,BigDecimal.valueOf(45) , new Editora(35L,"Record","418735278","Luta contra homofobia","Rua abobora"));
	
		Livros l1 = new Livros(1L,"A rainha vermelha","5327895436723","Rainha que tem sangue vermelho, luta contra reinado com sangue prateado",LocalDate.of(2016, 7, 9),Genero.FANTASIA,BigDecimal.valueOf(45));
		Livros l2 = new Livros(2L,"Cortes e espinhos","5157895433423","História de Feyre, uma humana que vive na extrema pobreza e tem que se virar sozinha para sustentar suas duas irmãs e seu pai.",LocalDate.of(2020, 5, 23),Genero.ACAO,BigDecimal.valueOf(55));
		Livros l3 = new Livros(3L,"Todo dia","5321495445623","Todo dia, Pedro troca de corpo como se fosse uma entidade",LocalDate.of(2013, 6, 10),Genero.ROMANCE,BigDecimal.valueOf(45));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("editora-livros");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
		em.persist(l1);
		em.persist(l2);
		em.persist(l3);
		System.out.println("pronto!");
		
		em.getTransaction().commit();
		em.close(); 
		emf.close();

	}

}
