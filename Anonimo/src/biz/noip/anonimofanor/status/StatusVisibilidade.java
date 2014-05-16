package biz.noip.anonimofanor.status;

public enum StatusVisibilidade {
	
	PUBLICO(1, "Público"),
	SOMENTE_AMIGOS(2, "Somente amigos"),
	PRIVADO(3, "Privado");
	
	private StatusVisibilidade(int cod, String nome){
		this.cod = cod;
		this.nome = nome;
	}
	
	private int cod;
	private String nome;
	
	public int getCod(){ return cod; }
	public String getNome(){ return nome; }

}
