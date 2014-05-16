package biz.noip.anonimofanor.status;

public enum StatusAmizade {

	
	PENDENTE(1, "Convite pendente"),
	AMIGO(2, "Amigo");
	
	private StatusAmizade(int cod, String nome){
		this.cod = cod;
		this.nome = nome;
	}
	
	private int cod;
	private String nome;
	
	public int getCod(){ return cod; }
	public String getNome(){ return nome; }
}
