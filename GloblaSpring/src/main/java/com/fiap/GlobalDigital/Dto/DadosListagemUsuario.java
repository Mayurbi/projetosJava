package com.fiap.GlobalDigital.Dto;

import com.fiap.GlobalDigital.Entity.Usuario;

public record DadosListagemUsuario(
		Long id,
		String nome,
		String cpf,
		String telefone,
		String email,
		String senha) {
	
	public DadosListagemUsuario(Usuario usuario) {
		this(
				usuario.getId(),
				usuario.getNome(),
				usuario.getCpf(),
				usuario.getTelefone(),
				usuario.getEmail(),
				usuario.getSenha()	
			);
	}
}
