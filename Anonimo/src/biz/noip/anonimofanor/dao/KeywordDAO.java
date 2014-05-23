package biz.noip.anonimofanor.dao;

import javax.persistence.Query;

import biz.noip.anonimofanor.entity.Keyword;

public class KeywordDAO extends GenericDAOImpl<Keyword, Long>{

	
	public KeywordDAO() {
		super(Keyword.class, "Keyword");
	}
	
	public Keyword buscarPorSlug(String slug){
		Query query = this.getEntityManager().
				createQuery("SELECT k FROM Keyword k WHERE slug = :slug");
		query.setParameter("slug", slug);
		
		return (Keyword) query.getSingleResult();
	}
}
