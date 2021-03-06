package biz.noip.anonimofanor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import biz.noip.anonimofanor.util.EntityManagerBuilder;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K> {

	private EntityManager entityManager = EntityManagerBuilder
			.getEntityManager();
	private Class<?> entityClass;
	private String nameTable;

	public GenericDAOImpl(Class<?> entityClass, String nameTable) {
		this.entityClass = entityClass;
		this.nameTable = nameTable;
	}

	@Override
	public T salvar(T obj) {

		this.entityManager.getTransaction().begin();
		this.entityManager.persist(obj);
		this.entityManager.getTransaction().commit();

		return obj;
	}

	@Override
	public T atualizar(T obj) {

		this.entityManager.getTransaction().begin();
		this.entityManager.merge(obj);
		this.entityManager.getTransaction().commit();

		return obj;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T buscarPorId(K key) {
		return (T) this.entityManager.find(this.entityClass, key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listar() {
		Query query = this.entityManager.createQuery("SELECT t FROM "
				+ this.nameTable + " t", this.entityClass);
		List<T> list = (List<T>) query.getResultList();
		this.entityManager.close();

		return list;
	}

	@Override
	public void excluir(T obj) {
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(obj);
		this.entityManager.getTransaction().commit();
		this.entityManager.close();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
