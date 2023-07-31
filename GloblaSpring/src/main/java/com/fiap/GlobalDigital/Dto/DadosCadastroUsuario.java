package com.fiap.GlobalDigital.Dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
		@NotBlank
		String nome,
		@NotBlank
		String cpf,
		@NotBlank
		String telefone,
		@NotBlank
		String email,
		@NotBlank
		String senha
		) {
}
