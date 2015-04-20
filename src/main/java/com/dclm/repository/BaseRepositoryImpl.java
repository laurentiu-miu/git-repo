package com.dclm.repository;

import com.dclm.model.BaseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

/**
 * Created by miulaurctin on 19/04/15.
 */
@Repository("baseRepository")
public class BaseRepositoryImpl<T extends BaseEntity> implements BaseRepository<T> {

    @PersistenceContext
    private EntityManager em;

    private Class<T> type;

    public BaseRepositoryImpl(Class<T> type) {
        super();
        this.type = type;
    }

    @Override
    public T get(Long id) {
        if (id == null) {
            return null;
        } else {
            return em.find(type, id);
        }
    }

    @Override
    public List<T> getAll() {
        return em.createQuery(
                "select o from " + type.getName() + "o"
        ).getResultList();
    }

    @Override
    public void save(T object) {
        if(object.getId() == null) {
            em.persist(object);
        } else {
            em.merge(object);
        }
    }

    @Override
    public void delete(T object) {
        em.remove(object);
    }
}
