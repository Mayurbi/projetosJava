package br.com.fiap.CatalogoJogos.requisitos;

import jakarta.validation.constraints.NotBlank;

public record DadosRequisitos(
		@NotBlank
		String sistemaOperacional,
		@NotBlank
		String processador,
		@NotBlank
		String memoria,
		@NotBlank
		String placaVideo,
		@NotBlank
		String armazenamento
		) {
}
