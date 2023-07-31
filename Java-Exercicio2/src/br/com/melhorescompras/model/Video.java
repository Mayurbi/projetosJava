package br.com.melhorescompras.model;

public class Video {
	private int id;
	private String nomeVideo;
	private String descricao;
	private String localArmazenamento;
	private int quantidadeVisualizacao, likes, duracao;
	private Profissional usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeVideo() {
		return nomeVideo;
	}

	public void setNomeVideo(String nomeVideo) {
		this.nomeVideo = nomeVideo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocalArmazenamento() {
		return localArmazenamento;
	}

	public void setLocalArmazenamento(String localArmazenamento) {
		this.localArmazenamento = localArmazenamento;
	}

	public int getQuantidadeVisualizacao() {
		return quantidadeVisualizacao;
	}

	public void setQuantidadeVisualizacao(int quantidadeVisualizacao) {
		this.quantidadeVisualizacao = quantidadeVisualizacao;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Profissional getUsuario() {
		return usuario;
	}

	public void setUsuario(Profissional usuario) {
		this.usuario = usuario;
	}

	public void adicionarLikes() {
		this.likes++;
	}

	public void adicionarVisualizacoes() {
		this.quantidadeVisualizacao++;
	}
}
