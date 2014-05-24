package biz.noip.anonimofanor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import biz.noip.anonimofanor.entity.Amizade;
import biz.noip.anonimofanor.util.EntityManagerBuilder;

public class AmizadeDAO {

	private EntityManager entityManager = EntityManagerBuilder
			.getEntityManager();

	@SuppressWarnings("unchecked")
	public List<Amizade> listarPorStatusAmizade() {
		Query query = this.entityManager
				.createQuery("SELECT statusamizade FROM " + "amizade");
		List<Amizade> list = (List<Amizade>) query.getResultList();
		this.entityManager.close();
		return list;

	}
}
