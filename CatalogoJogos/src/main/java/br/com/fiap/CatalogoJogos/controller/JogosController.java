package br.com.fiap.CatalogoJogos.controller;

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

import br.com.fiap.CatalogoJogos.model.DadosAtualizacaoJogos;
import br.com.fiap.CatalogoJogos.model.DadosCadastroJogos;
import br.com.fiap.CatalogoJogos.model.DadosListagemJogos;
import br.com.fiap.CatalogoJogos.model.Jogos;
import br.com.fiap.CatalogoJogos.model.JogosRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/jogos")
public class JogosController {
	@Autowired
	private JogosRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroJogos dados) {
		repository.save(new Jogos(dados));
	}

	@GetMapping
	public Page<DadosListagemJogos> listar(@PageableDefault() Pageable paginacao) {
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemJogos::new);
	}

	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoJogos dados) {
		Jogos jogos = new Jogos();
		jogos = repository.getReferenceById(dados.id());
		jogos.atualizaInformacoes(dados);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Jogos jogos = new Jogos();
		jogos = repository.getReferenceById(id);
		jogos.excluir();

	}
}
