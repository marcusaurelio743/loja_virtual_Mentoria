package br.com.lojaVirtual.enums;

public enum TipoEndereco {
	COBRANCA("cobranca"),
	ENTREGA("entrega");
	
	private String descricao;
	
	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
}
