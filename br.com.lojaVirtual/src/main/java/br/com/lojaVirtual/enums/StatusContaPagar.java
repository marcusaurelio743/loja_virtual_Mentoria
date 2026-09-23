package br.com.lojaVirtual.enums;

public enum StatusContaPagar {
	COBRANCA("cobranca"),
	VENCIDA("vencida"),
	ABERTA("aberta"),
	QUITADO("quitado"),
	NEGOCIADA("renegociado");
	
	private String descricao;
	
	private StatusContaPagar(String descricao) {
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
