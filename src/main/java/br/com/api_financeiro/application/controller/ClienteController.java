package br.com.api_financeiro.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api_financeiro.domain.model.Cliente;
import br.com.api_financeiro.domain.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
		this.clienteService.save(cliente);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listAll(){
		List<Cliente> clientes = this.clienteService.listAll();
		
		return clientes != null ? ResponseEntity.ok(clientes): ResponseEntity.noContent().build();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Integer id){
		Optional<Cliente> cliente = this.clienteService.findById(id);
		return ResponseEntity.ok(cliente.get());
	}
	
	@GetMapping("{cpf}")
	public ResponseEntity<Cliente> findByCpf(@PathVariable String cpf){
		this.clienteService.findByCpf(cpf);
		return ResponseEntity.ok().build();
	}
}
