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

import com.fiap.GlobalDigital.Dto.DadosAtualizacaoUsuario;
import com.fiap.GlobalDigital.Dto.DadosCadastroUsuario;
import com.fiap.GlobalDigital.Dto.DadosListagemUsuario;
import com.fiap.GlobalDigital.Entity.Usuario;
import com.fiap.GlobalDigital.Model.UsuarioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroUsuario dados) {
		repository.save(new Usuario(dados));
	}

	@GetMapping
	public Page<DadosListagemUsuario> listar(@PageableDefault Pageable paginacao) {
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemUsuario::new);
	}

	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoUsuario dados) {
		Usuario usuario = new Usuario();
		usuario = repository.getReferenceById(dados.id());
		usuario.atualizarInformacoes(dados);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario = repository.getReferenceById(id);
		usuario.excluir();
		
	}
}
