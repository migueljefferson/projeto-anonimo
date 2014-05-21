package biz.noip.anonimofanor.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//  suas atividades são as seguintes
//Criar as entidades Usuario e Amizade
//Fazer o relacionamento entre elas
//Integrar as novas entidades às que foram commitadas 

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario")
	private Long id;

	@Column(nullable = false, unique = true, length = 120)
	private String email;

	@Column(nullable = false, length = 100)
	private String senha;

	@Column(nullable = false)
	private Date dataUltimoLogin;

	@OneToMany(mappedBy = "usuario", targetEntity = Amizade.class, fetch = FetchType.LAZY)
	private List<Amizade> amizades;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataUltimoLogin() {
		return dataUltimoLogin;
	}

	public void setDataUltimoLogin(Date dataUltimoLogin) {
		this.dataUltimoLogin = dataUltimoLogin;
	}

	public List<Amizade> getAmizades() {
		return amizades;
	}

	public void setAmizades(List<Amizade> amizades) {
		this.amizades = amizades;
	}

	

}
