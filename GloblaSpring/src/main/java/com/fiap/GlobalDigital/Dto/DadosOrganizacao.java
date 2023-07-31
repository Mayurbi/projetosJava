package com.fiap.GlobalDigital.Dto;

import jakarta.validation.constraints.NotBlank;

public record DadosOrganizacao(
		@NotBlank
		String nome,
		@NotBlank
		String cnpj,
		@NotBlank
		String telefone,
		@NotBlank
		String email,
		@NotBlank
		String senha,
		@NotBlank
		String descricao
		) {
}
