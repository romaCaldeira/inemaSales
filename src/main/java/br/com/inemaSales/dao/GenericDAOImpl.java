package br.com.inemaSales.dao;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class GenericDAOImpl<T, PK> implements IGenericDAO<T, PK> {

    @PersistenceContext()
	protected EntityManager entityManager = Persistence.createEntityManagerFactory("postgreSQLInema").createEntityManager();

	
	public void persist(T entity) {
		entityManager.persist(entity);
	}

	public void merge(T entity) {
		entityManager.merge(entity);
	}

	public void remove(T entity) {
		entityManager.remove(entity);
	}

	public void removeById(PK id) {
		T entity = getById(id);
		entityManager.remove(entity);
	}

	public T getById(PK id) {
		return entityManager.find(getTypeClass(), id);
	}

	@SuppressWarnings("unchecked")
	public Collection<T> findAll() {
		return entityManager.createQuery("FROM " + getTypeClass().getName())
				.getResultList();
	}

	public Query createQuery(String query, Object... parameters) {
		Query q = entityManager.createQuery(query);
		for (int i = 1; i <= parameters.length; i++) {
			q.setParameter(i, parameters[i]);
		}

		return q;
	}

	@SuppressWarnings("unchecked")
	private Class<T> getTypeClass() {
		return (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
}