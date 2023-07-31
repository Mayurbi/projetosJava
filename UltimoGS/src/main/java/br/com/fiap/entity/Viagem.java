package br.com.fiap.entity;

import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;
import br.com.fiap.enuns.eventosEnum;
import br.com.fiap.enuns.statusViagemEnum;

@XmlRootElement
public class Viagem {
	private Integer id_viagem;
	protected String cep;
	private String ponto_interesse;
	private String ponto_saida;
	private String ponto_chegada;
	private String horario;
	private Integer valor;
	private eventosEnum eventos;
	private statusViagemEnum statusViagem;
	protected Comentario comentario;

//getters and setters
	public Integer getId_viagem() {
		return id_viagem;
	}

	public void setId_viagem(Integer id_viagem) {
		this.id_viagem = id_viagem;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPonto_saida() {
		return ponto_saida;
	}

	public void setPonto_saida(String ponto_saida) {
		this.ponto_saida = ponto_saida;
	}

	public String getPonto_chegada() {
		return ponto_chegada;
	}

	public void setPonto_chegada(String ponto_chegada) {
		this.ponto_chegada = ponto_chegada;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public eventosEnum getEventos() {
		return eventos;
	}

	public void setEventos(eventosEnum eventos) {
		this.eventos = eventos;
	}

	public statusViagemEnum getStatusViagem() {
		return statusViagem;
	}

	public void setStatusViagem(statusViagemEnum statusViagem) {
		this.statusViagem = statusViagem;
	}

	public String getPonto_interesse() {
		return ponto_interesse;
	}

	public void setPonto_interesse(String ponto_interesse) {
		this.ponto_interesse = ponto_interesse;
	}

//construtores
	public Viagem() {
	}

	public Viagem(Integer id,String cep, String ponto_interesse, String ponto_saida, String ponto_chegada, String horario,
			Integer valor, eventosEnum tipo, statusViagemEnum tipoViagem) {
        this.id_viagem = id;
        this.cep = cep;
        this.ponto_interesse = ponto_interesse;
        this.ponto_saida = ponto_saida;
        this.ponto_chegada = ponto_chegada;
        this.horario = horario;
        this.valor = valor;
        this.eventos = tipo;
        this.statusViagem = tipoViagem;
    }





	//metodo vincularcomentario
	public void vincularComentario(Comentario comentario, Motorista motorista, Usuario usuario) {
		System.out.println("Comentario vinculado para" + motorista.getNome_mot());
		System.out.println("Comentario vinculado para" + usuario.getNome_usu());
		this.comentario = comentario;
	}

}
