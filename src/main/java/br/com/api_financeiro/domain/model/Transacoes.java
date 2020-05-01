package br.com.api_financeiro.domain.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "TRANSACOES")
@Data
@EqualsAndHashCode
public class Transacoes {
	
	@Id
	@Column(name = "ID_TRANSACAO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JoinColumn(name = "ID_CONTA")
	@ManyToOne
	private Contas conta;
	
	@Column(name = "VALOR")
	private double valor;
	
	@Column(name = "DATA_TRANSACAO")
	private LocalDate dataTransacao;
	
	@Column(name = "NOME_ESTABELECIMENTO")
	private String nomeEstabelecimento;
}
