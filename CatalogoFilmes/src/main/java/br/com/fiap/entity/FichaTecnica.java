package br.com.fiap.entity;

import java.util.Objects;

import br.com.fiap.enuns.ClassificacaoIndicativa;
import br.com.fiap.records.DadosCadastroFicha;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
//Paola Mendes Bernardes RM93298, José Vitor Brasilino da Silva RM95438
@Embeddable
public class FichaTecnica {
	private String direcao;
	private String elenco;
	private String roteiro;
	private String producao;
	@Enumerated(EnumType.STRING)
	private ClassificacaoIndicativa classificacaoindicativa;

	// construtor vazio
	public FichaTecnica() {

	}

	// construtor com passagem de parametro
	public FichaTecnica(DadosCadastroFicha dados) {
		this.direcao = dados.direcao();
		this.elenco = dados.elenco();
		this.roteiro = dados.roteiro();
		this.producao = dados.producao();
		this.classificacaoindicativa = dados.classificacaoindicativa();
	}

	// getters and setters
	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public String getProducao() {
		return producao;
	}

	public void setProducao(String producao) {
		this.producao = producao;
	}

	public ClassificacaoIndicativa getClassificacaoindicativa() {
		return classificacaoindicativa;
	}

	public void setClassificacao_indicativa(ClassificacaoIndicativa classificacaoindicativa) {
		this.classificacaoindicativa = classificacaoindicativa;
	}

	// hash e equals
	@Override
	public int hashCode() {
		return Objects.hash(classificacaoindicativa, direcao, elenco, producao, roteiro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FichaTecnica other = (FichaTecnica) obj;
		return classificacaoindicativa == other.classificacaoindicativa && Objects.equals(direcao, other.direcao)
				&& Objects.equals(elenco, other.elenco) && Objects.equals(producao, other.producao)
				&& Objects.equals(roteiro, other.roteiro);
	}

	// metodo to string
	@Override
	public String toString() {
		return "FichaTecnica [direcao=" + direcao + ", elenco=" + elenco + ", roteiro=" + roteiro + ", producao="
				+ producao + ", classificacaoindicativa=" + classificacaoindicativa + "]";
	}
}
