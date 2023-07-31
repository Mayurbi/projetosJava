package aplicacao.Usuario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Usuario;

public class ListandoUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Query query = em.createQuery("select U from Usuario U");

		List<Usuario> usuarios = query.getResultList();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getId() + " - " + usuario.getNome() + " - " + usuario.getCpf() + " - "
					+ usuario.getEmail() + " - " + usuario.getTelefone()+ " - " + usuario.getDataCadastro());
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
