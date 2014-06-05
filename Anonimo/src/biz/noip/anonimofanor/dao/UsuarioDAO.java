package biz.noip.anonimofanor.dao;

import javax.persistence.Query;

import biz.noip.anonimofanor.entity.Usuario;

public class UsuarioDAO extends GenericDAOImpl<Usuario, Long> {

	public UsuarioDAO() {
		super(Usuario.class, "Usuario");
	}

	public Usuario buscarPorEmail(String email) {
		Query query = this.getEntityManager().createQuery(
				"SELECT u FROM usuario u WHERE email = :email", Usuario.class);
		query.setParameter("email", email);

		return (Usuario) query.getSingleResult();
	}
}
