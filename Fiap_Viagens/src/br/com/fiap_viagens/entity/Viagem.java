package br.com.fiap_viagens.entity;
/*
 * CREATE TABLE TBL_VIAGEM(
         ID_VIAGEM INT PRIMARY KEY,
         TX_DESTINO VARCHAR2(30) NOT NULL,
         TP_VIAGEM VARCHAR2(8) NOT NULL,
         DT_CHEGADA DATE NOT NULL,
         DT_SAIDA DATE,
         VLR_ORCAMENTO NUMERIC(10,2) NOT NULL,
         QTD_PESSOAS INT
); */

import java.sql.Date;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Viagem {

	private int id;
	private String destino;
	private String TipoViagem;
	private Date  dataChegada;
	private Date  dataSaida;
	private double valorOrcamento;
	private int quantidadePessoas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getTipoViagem() {
		return TipoViagem;
	}
	public void setTipoViagem(String tipoViagem) {
		TipoViagem = tipoViagem;
	}
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public double getValorOrcamento() {
		return valorOrcamento;
	}
	public void setValorOrcamento(double valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}
	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}
	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	
	
	
}
