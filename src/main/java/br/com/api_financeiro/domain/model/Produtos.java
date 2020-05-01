package br.com.api_financeiro.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "PRODUTOS")
@Data
@EqualsAndHashCode
public class Produtos {
	
	@Id
	@Column(name = "ID_PRODUTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOME_PRODUTO")
	private String nomeProduto;
	
	@JoinColumn(name = "ID_BANDEIRA")
	@OneToOne
	private Bandeiras bandeira;
}
