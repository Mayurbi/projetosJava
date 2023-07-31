package br.com.melhorescompras.model;

public class PerguntaResposta {
	private int id;
	private String descricao;
	private PerguntaResposta resposta;
	private Cliente usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public PerguntaResposta getResposta() {
		return resposta;
	}

	public void setResposta(PerguntaResposta resposta) {
		this.resposta = resposta;
	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}

}
