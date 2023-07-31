package br.com.fiap.records;

import br.com.fiap.entity.CatalogoFilmes;
import br.com.fiap.enuns.Genero;
//Paola Mendes Bernardes RM93298, José Vitor Brasilino da Silva RM95438
public record DadosListagemCatalogo(
		String titulo,
		String atorprincipal,
		String duracao,
		String anolancamento,
		String paisorigem,
		Genero genero	
		) {
	
	public DadosListagemCatalogo(CatalogoFilmes catalogo) {
		this(
				catalogo.getTitulo(),
				catalogo.getAtorprincipal(),
				catalogo.getDuracao(),
				catalogo.getAnolancamento(),
				catalogo.getPaisorigem(),
				catalogo.getGenero()
				);
	}
}
