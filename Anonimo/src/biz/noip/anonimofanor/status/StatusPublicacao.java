package biz.noip.anonimofanor.status;

public enum StatusPublicacao {
	
	RASCUNHO(1, "Rascunho"),
	PUBLICADO(1, "Publicado");
	
	private StatusPublicacao(int cod, String nome){
		this.cod = cod;
		this.nome = nome;
	}
	
	private int cod;
	private String nome;

	public int getCod(){
		return cod;
	}
	
	public String getNome(){
		return nome;
	}
}
