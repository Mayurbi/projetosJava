package br.com.fiap.records;

import br.com.fiap.enuns.Genero;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
//Paola Mendes Bernardes RM93298, José Vitor Brasilino da Silva RM95438
public record DadosCadastroCatalogo(
		@NotBlank
		String titulo,
		@NotBlank
		String atorprincipal,
		@NotBlank
		@Pattern(regexp="\\d{2,3}")
		String duracao,
		@NotBlank
		@Pattern(regexp="\\d{4}")
		String anolancamento,
		@NotBlank
		String paisorigem,
		@NotNull
		Genero genero,
		@Valid
		DadosCadastroFicha fichatecnica
		) {

}
