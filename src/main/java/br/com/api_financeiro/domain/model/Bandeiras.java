package br.com.api_financeiro.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANDEIRAS")
public class Bandeiras {
	
	@Id
	@Column(name = "ID_BANDEIRA")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idBandeira;
	
	@Column(name = "NOME")
	private String nome;
}
