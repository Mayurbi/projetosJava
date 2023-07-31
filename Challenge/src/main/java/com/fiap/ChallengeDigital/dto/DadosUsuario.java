package com.fiap.ChallengeDigital.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosUsuario(
		@NotBlank
		String id_usuario,
		@NotBlank
		String email,
		@NotBlank
		String senha,
		@NotBlank
		String estatistica,
		@NotBlank
		String empresa
		) {
}
