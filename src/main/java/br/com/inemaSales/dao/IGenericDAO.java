package br.com.inemaSales.dao;

import java.util.Collection;

import javax.persistence.Query;

public interface IGenericDAO<T, PK> {
	void persist(T entity);

	void merge(T entity);

	void remove(T entity);

	void removeById(PK id);

	T getById(PK id);

	Collection<T> findAll();

	Query createQuery(String query, Object... parameters);
}