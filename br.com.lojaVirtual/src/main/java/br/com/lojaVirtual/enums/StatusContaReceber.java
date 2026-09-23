package br.com.lojaVirtual.enums;

public enum StatusContaReceber {
	COBRANCA("cobranca"),
	VENCIDA("vencida"),
	ABERTA("aberta"),
	QUITADO("quitado");
	
	private String descricao;
	
	private StatusContaReceber(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		
		return this.descricao;
	}
}
