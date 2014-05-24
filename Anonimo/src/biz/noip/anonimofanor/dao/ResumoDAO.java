package biz.noip.anonimofanor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import biz.noip.anonimofanor.entity.Resumo;
import biz.noip.anonimofanor.util.EntityManagerBuilder;

public class ResumoDAO {

	private EntityManager entityManager = EntityManagerBuilder
			.getEntityManager();

	@SuppressWarnings("unchecked")
	public List<Resumo> listarPorStatusPublicacao() {
		Query query = this.entityManager
				.createQuery("SELECT statusPublicacao FROM " + "resumo");
		List<Resumo> list = (List<Resumo>) query.getResultList();
		this.entityManager.close();
		return list;

	}

	@SuppressWarnings("unchecked")
	public List<Resumo> listarPorStatusVisibilidade() {
		Query query = this.entityManager
				.createQuery("SELECT statusvisibilidade FROM " + "resumo");
		List<Resumo> list = (List<Resumo>) query.getResultList();
		this.entityManager.close();
		return list;

	}
}
