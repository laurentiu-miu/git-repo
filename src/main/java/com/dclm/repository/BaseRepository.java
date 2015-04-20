package com.dclm.repository;

import com.dclm.model.BaseEntity;

import java.util.List;

/**
 * Created by miulaurctin on 19/04/15.
 */
public interface BaseRepository<T extends BaseEntity> {
    public T get(Long id);
    public List<T> getAll();
    public void save(T object);
    public void delete(T object);
}
