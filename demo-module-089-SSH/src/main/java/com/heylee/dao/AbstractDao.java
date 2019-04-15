package com.heylee.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.loader.criteria.CriteriaQueryTranslator;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDao<PK extends Serializable, T> {

//    private final class<T> persistentClass;

    @Autowired
    protected SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void persist(T entity) {
        getSession().persist(entity);
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }

    public List<T> getAll(T entity) {
        Query query = getSession().createQuery("From :entity");
        query.setParameter("entity", entity.getClass().getName());
        return query.list();
    }

}
