package com.rstyle.maxmoto1702.spitter.persistence;

import com.rstyle.maxmoto1702.spitter.domain.Spitter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by m on 05.04.2015.
 */
@Repository
public class HibernateSpitterDAO implements SpitterDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public HibernateSpitterDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addSpitter(Spitter spitter) {
        currentSession().save(spitter);
    }

    public Spitter getSpitterById(long id) {
        return (Spitter) currentSession().get(Spitter.class, id);
    }

    public void saveSpitter(Spitter spitter) {
        currentSession().update(spitter);
    }
}