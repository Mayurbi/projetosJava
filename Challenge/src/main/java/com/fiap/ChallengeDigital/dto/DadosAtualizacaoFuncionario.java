package com.fiap.ChallengeDigital.dto;

import com.fiap.ChallengeDigital.entitys.ContratacaoEnum;
import com.fiap.ChallengeDigital.entitys.SenioridadeEnum;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoFuncionario(
		@NotNull
		Long id,
		String nome,
		String cargo,
		String iniciou_em,
		String saiu_em,
		String observacoes,
		String salario,
		String banco_horas,
		ContratacaoEnum contratacao,
		SenioridadeEnum senioridade,
		String equipe_id,
		DadosUsuario usuario
		) {

}
