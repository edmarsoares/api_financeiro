package br.com.api_financeiro.domain.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api_financeiro.domain.model.Cliente;
import br.com.api_financeiro.infrastructure.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void save(Cliente cliente) {
		this.clienteRepository.save(cliente);
	}
	
	public void delete(Integer id) {
		this.clienteRepository.deleteById(id);
	}
	
	public Optional<Cliente> findById(Integer id) {
		return this.clienteRepository.findById(id);
	}
	
	public Optional<Cliente> findByCpf(String cpf) {
		return this.clienteRepository.findByCpf(cpf);
	}
	
	public List<Cliente> listAll(){
		return this.clienteRepository.findAll();
	}
}
