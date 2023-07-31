package br.com.fiap.CatalogoJogos.model;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosRepository extends JpaRepository<Jogos, Long> {
	Page<Jogos> findAllByAtivoTrue(Pageable paginacao);
}
