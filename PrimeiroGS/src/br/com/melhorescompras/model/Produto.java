package br.com.melhorescompras.model;

import java.util.List;

public class Produto {
	private int id;
	private String nome, descricao, imagem;
	private double preco;
	private Detalhe detalhe;
	private List<Comentario> comentario;
	private int likes;
	private PerguntaResposta perguntaResposta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Detalhe getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(Detalhe detalhe) {
		this.detalhe = detalhe;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public PerguntaResposta getPerguntaResposta() {
		return perguntaResposta;
	}

	public void setPerguntaResposta(PerguntaResposta perguntaResposta) {
		this.perguntaResposta = perguntaResposta;
	}

}
