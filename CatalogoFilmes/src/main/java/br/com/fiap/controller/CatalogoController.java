package br.com.fiap.controller;

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

import br.com.fiap.entity.CatalogoFilmes;
import br.com.fiap.entity.CatalogoRepository;
import br.com.fiap.records.DadosAtualizacaoCatalogo;
import br.com.fiap.records.DadosCadastroCatalogo;
import br.com.fiap.records.DadosListagemCatalogo;
import jakarta.validation.Valid;
//Paola Mendes Bernardes RM93298, José Vitor Brasilino da Silva RM95438
@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
	@Autowired
	private CatalogoRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroCatalogo dados) {
		repository.save(new CatalogoFilmes(dados));
	}
	@GetMapping
	public Page<DadosListagemCatalogo> listar(@PageableDefault(size = 3, sort = "atorprincipal") Pageable paginacao){
		return repository.findAll(paginacao).map(DadosListagemCatalogo::new);
	}
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoCatalogo dados) {
		CatalogoFilmes catalogo = new CatalogoFilmes();
		catalogo = repository.getReferenceById(dados.id());
		catalogo.atualizarInformocoes(dados);
}
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir (@PathVariable Long id) {
		repository.deleteById(id);
	}
}