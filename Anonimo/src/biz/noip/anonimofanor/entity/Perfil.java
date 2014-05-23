package biz.noip.anonimofanor.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Perfil implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1581723122386319140L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_perfil")
	private Long id;
	
	@Column(length=120, nullable=false)
	private String nome;
	
	@Column(nullable=true)
	private Integer idade;
	
	@Column(length=45, nullable=true)
	private String escolaridade;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToMany
	private List<Resumo> resumos;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public List<Resumo> getResumos() {
		return resumos;
	}

	public void setResumos(List<Resumo> resumos) {
		this.resumos = resumos;
	}
}
