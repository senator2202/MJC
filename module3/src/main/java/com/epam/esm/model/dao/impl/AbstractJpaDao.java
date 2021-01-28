package com.epam.esm.model.dao.impl;

import com.epam.esm.model.dao.BaseDao;
import com.epam.esm.model.entity.Entity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

/**
 * The type Abstract jpa dao, with some basic method realizations
 *
 * @param <T> the type parameter
 */
@Repository
public abstract class AbstractJpaDao<T extends Entity> implements BaseDao<T> {

    /**
     * The Entity manager.
     */
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public Optional<T> findById(long id) {
        return Optional.ofNullable(entityManager.find(getEntityClass(), id));
    }

    @Override
    public T add(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public T update(T entity) {
        return entityManager.merge(entity);
    }

    /**
     * Gets class object of parameterized type. Used in findById method
     *
     * @return the entity class
     */
    protected abstract Class<T> getEntityClass();
}
