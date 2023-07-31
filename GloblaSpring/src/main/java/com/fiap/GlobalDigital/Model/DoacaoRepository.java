package com.fiap.GlobalDigital.Model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.GlobalDigital.Entity.Doacao;

public interface DoacaoRepository extends JpaRepository <Doacao, Long>{
	Page <Doacao> findAllByAtivoTrue(Pageable paginacao);
}
