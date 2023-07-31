package com.fiap.GlobalDigital.Dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
		@NotNull
		Long id,
		String nome,
		String cpf,
		String telefone,
		String email,
		String senha
		) {

}
