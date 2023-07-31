package com.fiap.ChallengeDigital.dto;

import com.fiap.ChallengeDigital.entitys.ContratacaoEnum;
import com.fiap.ChallengeDigital.entitys.Funcionario;
import com.fiap.ChallengeDigital.entitys.SenioridadeEnum;


public record DadosListagemFuncionario(
		Long id,
		String nome,
		String cargo,
		String inicou_em,
		String saiu_em,
		String observacoes,
		String salario,
		String banco_horas,
		ContratacaoEnum contratacao,
		SenioridadeEnum senioridade,
		String equipe_id,
		String email,
		String senha,
		String empresa
		) {
	public DadosListagemFuncionario(Funcionario funcionario) {
			this( 	funcionario.getId(),
					funcionario.getNome(),
					funcionario.getCargo(),
					funcionario.getIniciou_em(),
					funcionario.getSaiu_em(),
					funcionario.getObservacoes(),
					funcionario.getSalario(),
					funcionario.getBanco_horas(),
					funcionario.getContratacao(),
					funcionario.getSenioridade(),
					funcionario.getEquipe_id(),
					funcionario.getUsuario().getEmail(),
					funcionario.getUsuario().getSenha(),
					funcionario.getUsuario().getEmpresa());
				
		}


}
