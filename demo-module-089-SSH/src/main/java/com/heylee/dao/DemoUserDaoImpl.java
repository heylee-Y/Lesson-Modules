package com.heylee.dao;

import com.heylee.model.DemoUser;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DemoUserDaoImpl extends AbstractDao<Long, DemoUser> implements DemoUserDao {

    public List<DemoUser> findAllUsers() {
        Criteria criteria = getSession().createCriteria(DemoUser.class);
        criteria.add(Restrictions.eq("id", 100L));
        return criteria.list();
    }

    public List<DemoUser> getAllUsers() {
        Query query = getSession().createQuery("From " + DemoUser.class.getName());
        query.setMaxResults(3);
        return query.list();
    }

    public void save(DemoUser user) {
        persist(user);
    }

    public DemoUser getById(Long id) {
        return getSession().get(DemoUser.class, id);
    }

    public void updateUser(DemoUser user) {
        DemoUser demoUser = getById(100L);
        if (demoUser != null) {
            demoUser.setName(user.getName());
            demoUser.setComment(user.getComment());
        }
        throw new RuntimeException();
    }
}
