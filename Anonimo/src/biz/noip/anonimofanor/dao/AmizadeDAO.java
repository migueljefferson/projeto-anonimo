package biz.noip.anonimofanor.dao;

import java.util.List;

import javax.persistence.Query;

import biz.noip.anonimofanor.entity.Amizade;

public class AmizadeDAO extends GenericDAOImpl<Amizade, Long> {

	public AmizadeDAO() {
		super(Amizade.class, "Amizade");

	}

	@SuppressWarnings("unchecked")
	public List<Amizade> listarPorStatusAmizade(Integer statusAmizade) {
		Query query = this.getEntityManager().createQuery(
				"SELECT a FROM amizade a WHERE statusamizade = :statusamizade",
				Amizade.class);
		query.setParameter("statusamizade", statusAmizade);
		List<Amizade> list = (List<Amizade>) query.getResultList();
		return list;

	}

}
