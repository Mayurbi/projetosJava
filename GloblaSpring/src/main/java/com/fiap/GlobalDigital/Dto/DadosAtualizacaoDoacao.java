package com.fiap.GlobalDigital.Dto;

import java.math.BigDecimal;

import com.fiap.GlobalDigital.Entity.EnumFormaPagamento;
import com.fiap.GlobalDigital.Entity.Usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoDoacao(
		@NotNull
		Long id,
		BigDecimal preco,
		EnumFormaPagamento formaPagamento,
		Usuario doador,
		DadosOrganizacao organizacao
		) {
}
