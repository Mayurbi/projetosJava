package com.fiap.ChallengeDigital.dto;

import com.fiap.ChallengeDigital.entitys.ContratacaoEnum;
import com.fiap.ChallengeDigital.entitys.SenioridadeEnum;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroFuncionario(
	
		@NotBlank
		String nome,
		@NotBlank
		String cargo,
		@NotBlank
		String iniciou_em,
		@NotBlank
		String saiu_em,
		@NotBlank
		String observacoes,
		@NotBlank
		String salario,
		@NotBlank
		String banco_horas,
		@NotNull
		ContratacaoEnum contratacao,
		@NotNull
		SenioridadeEnum senioridade,
		@NotBlank
		String equipe_id,
		@NotNull @Valid
		DadosUsuario usuario
		) {}

