package com.fiap.GlobalDigital.Dto;

import java.math.BigDecimal;

import com.fiap.GlobalDigital.Entity.EnumFormaPagamento;
import com.fiap.GlobalDigital.Entity.Organizacao;
import com.fiap.GlobalDigital.Entity.Usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroDoacao(
		@NotBlank
		BigDecimal preco,
		@NotBlank
		EnumFormaPagamento formaPagamento,
		@NotBlank
		Usuario doador,
		@NotBlank
		DadosOrganizacao organizacao
		) {
	
}
