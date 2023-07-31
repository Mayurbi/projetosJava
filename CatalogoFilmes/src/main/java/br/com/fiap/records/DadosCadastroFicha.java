package br.com.fiap.records;

import br.com.fiap.enuns.ClassificacaoIndicativa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
//Paola Mendes Bernardes RM93298, José Vitor Brasilino da Silva RM95438
public record DadosCadastroFicha(
		@NotBlank
		String direcao,
		@NotBlank
		String elenco,
		@NotBlank
		String roteiro,
		@NotBlank
		String producao,
		@NotNull
		@Valid
		ClassificacaoIndicativa classificacaoindicativa
		) {

}
