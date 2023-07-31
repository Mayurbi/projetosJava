package com.fiap.ChallengeDigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.ChallengeDigital.dto.DadosAtualizacaoFuncionario;
import com.fiap.ChallengeDigital.dto.DadosCadastroFuncionario;
import com.fiap.ChallengeDigital.dto.DadosListagemFuncionario;
import com.fiap.ChallengeDigital.entitys.Funcionario;
import com.fiap.ChallengeDigital.entitys.FuncionarioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	@Autowired
	private FuncionarioRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroFuncionario dados) {
		repository.save(new Funcionario(dados));
	}

	@GetMapping
	public Page<DadosListagemFuncionario> listar(@PageableDefault() Pageable paginacao) {
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemFuncionario::new);
	}

	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoFuncionario dados) {
		Funcionario funcionario = new Funcionario();
		funcionario = repository.getReferenceById(dados.id());
		funcionario.atualizaInformacoes(dados);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Funcionario funcionario = new Funcionario();
		funcionario = repository.getReferenceById(id);
		funcionario.excluir();

	}
}
