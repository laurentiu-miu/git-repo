package com.dclm.services;

import com.dclm.model.BaseEntity;

import java.util.List;

/**
 * Created by miulaurctin on 19/04/15.
 */
public interface BaseService {
    public <T extends BaseEntity> T get(Long id);
    public <T extends BaseEntity> List<T> getAll();
    public <T extends BaseEntity> void save(T object);
    public <T extends BaseEntity> void delete(T object);
}
