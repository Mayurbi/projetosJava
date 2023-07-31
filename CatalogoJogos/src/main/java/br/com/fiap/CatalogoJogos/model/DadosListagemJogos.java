package br.com.fiap.CatalogoJogos.model;

public record DadosListagemJogos(
		Long id,
		String titulo,
		String desenvolvedora,
		String nJogadores,
		Genero genero,
		String armazenamento
		) {
	public DadosListagemJogos(Jogos jogos) {
			this(
					jogos.getId(),
					jogos.getTitulo(),
					jogos.getDesenvolvedora(),
					jogos.getnJogadores(),
					jogos.getGenero(),
					jogos.getRequisitosSistemas().getArmazenamento());

}
}