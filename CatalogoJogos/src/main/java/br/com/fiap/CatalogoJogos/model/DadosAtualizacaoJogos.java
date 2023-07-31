package br.com.fiap.CatalogoJogos.model;

import br.com.fiap.CatalogoJogos.requisitos.DadosRequisitos;
import jakarta.validation.constraints.NotNull;


public record DadosAtualizacaoJogos(
		@NotNull
		Long id,
		String titulo,
		String desenvolvedora,
		String distribuidora,
		String idiomas,
		String nJogadores,
		String lancamento,
		Genero genero,
		DadosRequisitos dadosRequisitosSistemas
		) {

}
