package br.com.lojaVirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.lojaVirtual.enums.StatusContaPagar;

@Entity
@Table(name = "conta_pagar")
@SequenceGenerator(name = "seq_conta_pagar",sequenceName = "seq_conta_pagar",allocationSize =1,initialValue = 1)

public class ContaPagar implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_conta_pagar")
	private Long id;
	
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private StatusContaPagar contaReceber;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_pagamento")
	private Date dataPagamento;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_vencimento")
	private Date dataVencimento;
	@Column(name = "valor_total")
	private BigDecimal ValorTotal;
	@Column(name = "valor_desconto")
	private BigDecimal valorDesconto;
	
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id",nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "pessoa_fk"))
	private Pessoa pessoa;
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id_forn",nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "pessoa_forn_fk"))
	private Pessoa pessoaFornecedor;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public StatusContaPagar getContaReceber() {
		return contaReceber;
	}
	public void setContaReceber(StatusContaPagar contaReceber) {
		this.contaReceber = contaReceber;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	public BigDecimal getValorTotal() {
		return ValorTotal;
	}


	public void setValorTotal(BigDecimal valorTotal) {
		ValorTotal = valorTotal;
	}


	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}


	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public Pessoa getPessoaFornecedor() {
		return pessoaFornecedor;
	}


	public void setPessoaFornecedor(Pessoa pessoaFornecedor) {
		this.pessoaFornecedor = pessoaFornecedor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaPagar other = (ContaPagar) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	

}
