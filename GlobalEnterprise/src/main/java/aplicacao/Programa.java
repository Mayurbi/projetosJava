package aplicacao;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Doacao;
import dominio.EnumFormaPagamento;
import dominio.Organizacao;
import dominio.Usuario;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("global-enterprise");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

// Instancias Usuario		
		Usuario usu1 = new Usuario();
		usu1.setId(1L);
		usu1.setNome("Bruno Calebe Moraes");
		usu1.setCpf(09623734786D);
		usu1.setTelefone(11965498710D);
		usu1.setEmail("bruno-moraes86@db4.com.br");
		usu1.setSenha("aa1165ggBruno");
		usu1.setDataCadastro(LocalDate.of(2022, 4, 23));

		if (usu1.getId() == null)
			em.persist(usu1);
		else
			em.merge(usu1);

		Usuario usu2 = new Usuario();
		usu2.setId(2L);
		usu2.setNome("Vitória Olivia Antônia Mendes");
		usu2.setCpf(66617125460D);
		usu2.setTelefone(21987413365D);
		usu2.setEmail("vitOliviaMNDS@yahoo.com.br");
		usu2.setSenha("vitvit123123");
		usu2.setDataCadastro(LocalDate.of(2022, 6, 8));

		if (usu2.getId() == null)
			em.persist(usu2);
		else
			em.merge(usu2);

		Usuario usu3 = new Usuario();
		usu3.setId(3L);
		usu3.setNome("Débora Daniela Laura Monteiro");
		usu3.setCpf(91024607852D);
		usu3.setTelefone(12994572531D);
		usu3.setEmail("deboradanielamont@gmail.com");
		usu3.setSenha("pxNh3z1IF0");
		usu3.setDataCadastro(LocalDate.of(2021, 2, 7));

		if (usu3.getId() == null)
			em.persist(usu3);
		else
			em.merge(usu3);

		Usuario usu4 = new Usuario();
		usu4.setId(4L);
		usu4.setNome("Mateus Caleb da Costa");
		usu4.setCpf(53702130705D);
		usu4.setTelefone(11955210496D);
		usu4.setEmail("mateusCalebLol@bol.com.br");
		usu4.setSenha("os8u3jnR8Y");
		usu4.setDataCadastro(LocalDate.of(2022, 1, 30));

		if (usu4.getId() == null)
			em.persist(usu4);
		else
			em.merge(usu4);

		Usuario usu5 = new Usuario();
		usu5.setId(5L);
		usu5.setNome("Augusto Antonio Anthony Matos");
		usu5.setCpf(40021788626D);
		usu5.setTelefone(84987896163D);
		usu5.setEmail("augusto_do_mato@gmail.com");
		usu5.setSenha("senha123Augusto9.");
		usu5.setDataCadastro(LocalDate.of(2022, 6, 8));

		if (usu5.getId() == null)
			em.persist(usu5);
		else
			em.merge(usu5);

		
/// Instacias doação
		Doacao doa1 = new Doacao();
		doa1.setId(11L);
		doa1.setPreco(new BigDecimal(20.36));
		doa1.setFormaPagamento(EnumFormaPagamento.PIX);
		doa1.setUsuario(usu1);
		doa1.setOrganizacao(new Organizacao(6L, "Food4All", 17278267000148D, 5511963584120D,
				"food_for_all@food4all.com", "sse100DA..ADl",
				"A Food4All é uma organização comprometida a combater a fome e a insegurança alimentar em comunidades ao redor do mundo. Acreditamos que todos têm o direito fundamental de ter acesso a alimentos saudáveis e nutritivos, independente da situação socioeconômica. \r\n"
						+ "    Com a parceria de empresas alimentícias e agricultores locais garantimos a disponibilidade e o acesso equitativo a alimentos de qualidade. Nossa jornada apenas começou, junte-se a nós para promover um futuro mais justo e sustentável"));

		if (doa1.getId() == null)
			em.persist(doa1);
		else
			em.merge(doa1);

		Doacao doa2 = new Doacao();
		doa2.setId(12l);
		doa2.setPreco(new BigDecimal(35));
		doa2.setFormaPagamento(EnumFormaPagamento.CREDITO);
		doa2.setUsuario(usu2);
		doa2.setOrganizacao(new Organizacao(7L, "Help, Yes", 43734295000132D, 5511926110458D, "helpYeS@gmail.com",
				"111fdsHlpYs.",
				"O objetivo da organização \"Help, Yes\" é promover assistência humanitária a comunidades afetadas por desastres naturais, crises humanitárias e outras situações de emergência pelo mundo. \r\n"
						+ "    Trabalhamos com organizações locais, instituições internacionais e doadores para potencializar a nossa força e fornecer assistência àqueles que se encontram vuneráveis em tempos de crise. É imprescindível a solidariedade e comprometimento de todos, pois assim, fazemos a diferença"));

		if (doa2.getId() == null)
			em.persist(doa2);
		else
			em.merge(doa2);

		Doacao doa3 = new Doacao();
		doa3.setId(13l);
		doa3.setPreco(new BigDecimal(100));
		doa3.setFormaPagamento(EnumFormaPagamento.PIX);
		doa3.setUsuario(usu3);
		doa3.setOrganizacao(new Organizacao(8L, "AllTogether", 50937623000163D, 5562981100365D,
				"allTogether@alltghr.com", "0024789E.",
				"A AllTogether tem como finalidade promover a inclusão, a diversidade e igualdade em todas as camadas da sociedade. Acreditamos que todas as pessoas, independentemente de sua origem, identidade, habilidades ou características individuais, merecem ser valorizadas e respeitadas."));

		if (doa3.getId() == null)
			em.persist(doa3);
		else
			em.merge(doa3);

		Doacao doa4 = new Doacao();
		doa4.setId(14l);
		doa4.setPreco(new BigDecimal(50));
		doa4.setFormaPagamento(EnumFormaPagamento.PIX);
		doa4.setUsuario(usu4);
		doa4.setOrganizacao(new Organizacao(9L, "O mundo antes", 38070303000153D, 5583985460594D,
				"mundoAntes@gmail.com", "123Mundo.07",
				"Nós somos \"O Mundo Antes\", uma organização que busca a preservação de patrimônios históricos e valores culturais do mundo. Nosso trabalho visa democratizar o acesso à informação histórica, por meio de iniciativas digitais, publicações, workshops e programas de capacitação. \r\n"
						+ "    Com sua ajuda, escrevemos um futuro onde o passado seja honrado e respeitado."));

		if (doa4.getId() == null)
			em.persist(doa4);
		else
			em.merge(doa4);

		Doacao doa5 = new Doacao();
		doa5.setId(15l);
		doa5.setPreco(new BigDecimal(120.5));
		doa5.setFormaPagamento(EnumFormaPagamento.DEBITO);
		doa5.setUsuario(usu4);
		doa5.setOrganizacao(new Organizacao(10L, "Juntos Podemos", 77789189000178D, 5569997591324D,
				"juntos_podemos@juntosPodemos.com", "sjjOdsf.84.",
				"A missão do \"Juntos Podemos\" é capacitar e transformar vidas por meio da educação e do desenvolvimento comunitário. Através de programas educacionais abrangentes, oferecemos suporte acadêmico, orientação vocacional e habilidades práticas para todas as faixas etárias. \r\n"
						+ "    Unidos, podemos superar desafios e ajudamos a formar indivíduos capazes de alcançar seus sonhos e contribuir para suas comunidades."));

		if (doa5.getId() == null)
			em.persist(doa5);
		else
			em.merge(doa5);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}
}
