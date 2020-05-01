package br.com.api_financeiro.domain.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARTOES")
public class Cartoes {
	
	@Id
	@Column(name = "ID_CARTAO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCartao;
	
	@JoinColumn(name = "ID_CONTA")
	@OneToOne()
	private Contas conta;
	
	@Column(name = "CARTAO_MASCARADO", length = 20)
	private String cartaoMascarado;
	
	@Column(name = "DATA_VALIDADE")
	private LocalDate dataValidade;
	
	@Column(name = "CVV_CRIPTO")
	private String cvvCripto;
	
	@JoinColumn(name = "STATUS")
	@OneToOne
	private StatusCartao status;
	
	@Column(name = "DATA_STATUS", length = 20)
	private LocalDate dataStatus;
}
