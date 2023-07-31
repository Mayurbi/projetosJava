package br.com.fiap_viagens.entity;

import java.util.Date;

import br.com.fiap_viagens.enums.CategoriaEnum;

/*
 * CREATE TABLE TBL_GASTO (
         ID_GASTO INT PRIMARY KEY,
         TX_DESCRICAO VARCHAR2(30) NOT NULL,
         TX_LOCAL VARCHAR2(20) NOT NULL,
         TP_CATEGORIA VARCHAR2(11) NOT NULL,
         DT_GASTO DATE NOT NULL,
         VLR_GASTO FLOAT NOT NULL,
         ID_VIAGEM INT NOT NULL,
         FOREIGN KEY (ID_VIAGEM) REFERENCES TBL_VIAGEM(ID_VIAGEM)
);

*/
public class Gasto {
	
private Long id;
    
    private String descricao;
    private String local;
    private CategoriaEnum categoria;
    private Date data;
    private Double valor;
    private Viagem viagem;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public CategoriaEnum getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Viagem getViagem() {
		return viagem;
	}
	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
    
    

}
