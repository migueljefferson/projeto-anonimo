package biz.noip.anonimofanor.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Keyword implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1657923805450134393L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_keyword")
	private Long id;
	
	@Column(nullable=false, unique=true, length=45)
	private String slug;
	
	@ManyToMany
	private List<Resumo> resumos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public List<Resumo> getResumos() {
		return resumos;
	}

	public void setResumos(List<Resumo> resumos) {
		this.resumos = resumos;
	}
	
	
}
