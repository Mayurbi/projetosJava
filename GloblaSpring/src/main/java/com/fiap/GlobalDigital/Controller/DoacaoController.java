package com.fiap.GlobalDigital.Controller;

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

import com.fiap.GlobalDigital.Dto.DadosAtualizacaoDoacao;
import com.fiap.GlobalDigital.Dto.DadosCadastroDoacao;
import com.fiap.GlobalDigital.Dto.DadosListagemDoacao;
import com.fiap.GlobalDigital.Entity.Doacao;
import com.fiap.GlobalDigital.Model.DoacaoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/doacao")
public class DoacaoController {
	@Autowired
	private DoacaoRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroDoacao dados) {
		repository.save(new Doacao(dados));
		
	}

	@GetMapping
	public Page<DadosListagemDoacao> listar(@PageableDefault Pageable paginacao) {
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemDoacao::new);
	}

	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoDoacao dados) {
		Doacao doacao = new Doacao();
		doacao = repository.getReferenceById(dados.id());
		doacao.atualizarInformacoes(dados);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Doacao doacao = new Doacao();
		doacao = repository.getReferenceById(id);
		doacao.excluir();
	}
}
