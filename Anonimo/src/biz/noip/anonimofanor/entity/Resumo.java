package biz.noip.anonimofanor.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import biz.noip.anonimofanor.status.StatusPublicacao;
import biz.noip.anonimofanor.status.StatusVisibilidade;

@Entity
public class Resumo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6635019759993770610L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_resumo")
	private Long id;

	@Column(length = 120, nullable = false)
	private String titulo;

	@Column(columnDefinition = "TEXT", nullable = true)
	private String texto;

	// @Column(name="status_publicacao", nullable=false)
	// private StatusPublicacao statusPublicacao;

	@Enumerated(EnumType.ORDINAL)
	public StatusPublicacao statusPublicacao;

//	@Column(name = "status_visibilidade", nullable = false)
//	private StatusVisibilidade statusVisibilidade;
	
	@Enumerated(EnumType.ORDINAL)
	public StatusVisibilidade statusVisibilidade;

	@Column(length = 70, nullable = false)
	private String area;

	@ManyToOne
	private Perfil perfil;

	@ManyToMany
	private Set<Keyword> keywords;

	public Set<Keyword> getKeywords() {
		return keywords;
	}

	public void setKeywords(Set<Keyword> keywords) {
		this.keywords = keywords;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public StatusVisibilidade getStatusVisibilidade() {
		return statusVisibilidade;
	}

	public void setStatusVisibilidade(StatusVisibilidade statusVisibilidade) {
		this.statusVisibilidade = statusVisibilidade;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public StatusPublicacao getStatuPublicacao() {
		return statusPublicacao;
	}

	public void setStatuPublicacao(StatusPublicacao statuPublicacao) {
		this.statusPublicacao = statuPublicacao;
	}

}
