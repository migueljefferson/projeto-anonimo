package biz.noip.anonimofanor.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerBuilder {

	private static final String PERSISTENCE_UNIT_NAME = "anonimo";
	
	private static final EntityManager entityManager = buildEntityManager();
	
	private static EntityManager buildEntityManager(){
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			
			try {
				EntityManager manager = factory.createEntityManager();
				
				return manager;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static EntityManager getEntityManager(){
		return entityManager;
	}
	
}
