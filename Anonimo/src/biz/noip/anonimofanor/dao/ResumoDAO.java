package biz.noip.anonimofanor.dao;

import java.util.List;

import javax.persistence.Query;

import biz.noip.anonimofanor.entity.Resumo;

public class ResumoDAO extends GenericDAOImpl<Resumo, Long> {

	public ResumoDAO() {
		super(Resumo.class, "Resumo");

	}

	@SuppressWarnings("unchecked")
	public List<Resumo> listarPorStatusPublicacao(Integer statusPublicacao) {
		Query query = this
				.getEntityManager()
				.createQuery(
						"SELECT s FROM resumo s WHERE statuspublicacao = :statuspublicacao",
						Resumo.class);
		query.setParameter("statuspublicacao", statusPublicacao);
		List<Resumo> list = (List<Resumo>) query.getResultList();
		return list;

	}

	@SuppressWarnings("unchecked")
	public List<Resumo> listarPorStatusVisibilidade(Integer statusVisibilidade) {
		Query query = this
				.getEntityManager()
				.createQuery(
						"SELECT s FROM resumo s WHERE statusvisibilidade = :statusvisibilidade",
						Resumo.class);
		query.setParameter("statusvisibilidade", statusVisibilidade);
		List<Resumo> list = (List<Resumo>) query.getResultList();
		return list;

	}

}
