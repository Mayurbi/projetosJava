package br.com.fiap.CatalogoJogos.model;

import br.com.fiap.CatalogoJogos.requisitos.DadosRequisitos;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroJogos(
		@NotBlank
		String titulo,
		@NotBlank
		String desenvolvedora,
		@NotBlank
		String distribuidora,
		@NotBlank
		String idiomas,
		@NotBlank
		@Pattern(regexp="\\d{1-4}")
		String nJogadores,
		@NotBlank
		@Pattern(regexp="\\d{4}")
		String lancamento,
		@NotNull
		Genero genero,
		@NotNull @Valid
		DadosRequisitos requisitosSistemas
		){

}
