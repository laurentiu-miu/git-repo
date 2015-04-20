package com.dclm.services;

import com.dclm.model.BaseEntity;
import com.dclm.repository.BaseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by miulaurctin on 19/04/15.
 */
@Service("baseService")
@Transactional
public class BaseServiceImpl implements BaseService {

    @Resource(name="baseRepository")
    public BaseRepository br;

    @Transactional(readOnly = true)

    @Override
    public <T extends BaseEntity> T get(Long id) {
        return (T) br.get(id);
    }

    @Override
    public <T extends BaseEntity> List<T> getAll() {
        return br.getAll();
    }

    @Override
    public <T extends BaseEntity> void save(T object) {
        br.save(object);
    }

    @Override
    public <T extends BaseEntity> void delete(T object) {
        br.save(object);
    }
}
