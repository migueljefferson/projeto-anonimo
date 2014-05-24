package biz.noip.anonimofanor.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import biz.noip.anonimofanor.status.StatusAmizade;

@Entity
public class Amizade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_amizade")
	private Long id;

	@Enumerated(EnumType.ORDINAL)
	public StatusAmizade statusAmizade;

	@Column(nullable = false)
	private Date dataAmizade;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuarioConvidado;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuarioConvidador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatusAmizade getStatuAmizade() {
		return statusAmizade;
	}

	public void setStatuAmizade(StatusAmizade statuAmizade) {
		this.statusAmizade = statuAmizade;
	}

	public Date getDataAmizade() {
		return dataAmizade;
	}

	public void setDataAmizade(Date dataAmizade) {
		this.dataAmizade = dataAmizade;
	}

	public Usuario getUsuarioConvidado() {
		return usuarioConvidado;
	}

	public void setUsuarioConvidado(Usuario usuarioConvidado) {
		this.usuarioConvidado = usuarioConvidado;
	}

	public Usuario getUsuarioConvidador() {
		return usuarioConvidador;
	}

	public void setUsuarioConvidador(Usuario usuarioConvidador) {
		this.usuarioConvidador = usuarioConvidador;
	}

}
