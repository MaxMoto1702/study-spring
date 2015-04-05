package com.rstyle.maxmoto1702.spitter.persistence;

import com.rstyle.maxmoto1702.spitter.domain.Spitter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by m on 05.04.2015.
 */
@Repository("spitterDao")
@Transactional
public class JpaSpitterDAO implements SpitterDAO {

    private static final String RECENT_SPITTLES = "SELECT s FROM Spittle s";
    private static final String ALL_SPITTERS = "SELECT s FROM Spitter s";
    private static final String SPITTER_FOR_USERNAME = "SELECT s FROM Spitter s WHERE s.username = :username";
    private static final String SPITTLES_BY_USERNAME = "SELECT s FROM Spittle s WHERE s.spitter.username = :username";

    @PersistenceContext
    private EntityManager entityManager;

    public void addSpitter(Spitter spitter) {
        entityManager.persist(spitter);
    }

    public Spitter getSpitterById(long id) {
        return entityManager.find(Spitter.class, id);
    }

    public void saveSpitter(Spitter spitter) {
        entityManager.merge(spitter);
    }
}
