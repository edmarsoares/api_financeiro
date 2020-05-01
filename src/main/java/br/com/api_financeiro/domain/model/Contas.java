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
@Table(name = "CONTAS")
@Data
@EqualsAndHashCode
public class Contas {
	
	@Id
	@Column(name = "ID_CONTA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JoinColumn(name = "ID_PESSOAFISICA")
	@OneToOne
	private Cliente cliente;
	
	@JoinColumn(name = "ID_PRODUTO")
	@OneToOne
	private Produtos produto;
	
	@Column(name = "LIMITE_TOTAL")
	private double limiteTotal;

	@Column(name = "LIMITE_DISPONIVEL")
	private double limiteDisponivel; 
}
