package com.fiap.GlobalDigital.Dto;

import java.math.BigDecimal;

import com.fiap.GlobalDigital.Entity.Doacao;
import com.fiap.GlobalDigital.Entity.EnumFormaPagamento;
import com.fiap.GlobalDigital.Entity.Organizacao;
import com.fiap.GlobalDigital.Entity.Usuario;

public record DadosListagemDoacao(
		Long id,
		BigDecimal preco,
		EnumFormaPagamento formaPagamento,
		Usuario doador,
		Organizacao organizacao) {
	
	public DadosListagemDoacao(Doacao doacao) {
		this(
				doacao.getId(),
				doacao.getPreco(),
				doacao.getFormaPagamento(),
				doacao.getDoador(),
				doacao.getOrganizacao()	
			);
	}
}
