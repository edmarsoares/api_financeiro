package br.com.api_financeiro.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "STATUS_CARTAO")
@Data
@EqualsAndHashCode
public class StatusCartao {
	
	@Id
	@Column(name = "ID_CARTAO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "DESCRICAO_STATUS")
	private String descricao;
}
