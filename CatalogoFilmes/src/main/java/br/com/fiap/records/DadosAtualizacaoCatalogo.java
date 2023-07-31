package br.com.fiap.records;

import br.com.fiap.entity.FichaTecnica;
import br.com.fiap.enuns.Genero;
import jakarta.validation.constraints.NotNull;
//Paola Mendes Bernardes RM93298, José Vitor Brasilino da Silva RM95438
public record DadosAtualizacaoCatalogo(
		@NotNull
		Long id,
		String titulo,
		String atorprincipal,
		String duracao,
		String anolancamento,
		String paisorigem,
		Genero genero,
		FichaTecnica fichatecnica	
		) {

}
