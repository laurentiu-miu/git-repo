package com.dclm.components;

import com.dclm.model.BaseEntity;

/**
 * Created by miulaurctin on 20/04/15.
 */
public interface UrlPathToClassMapper {
    <T extends BaseEntity> Class<T> getEntityByPath(String path);
}
