package com.fiap.GlobalDigital.Model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.GlobalDigital.Entity.Usuario;

public interface UsuarioRepository  extends JpaRepository <Usuario, Long>{
	Page <Usuario> findAllByAtivoTrue(Pageable paginacao);
}
