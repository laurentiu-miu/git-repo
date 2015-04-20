package com.dclm.components;

import com.dclm.model.BaseEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by miulaurctin on 20/04/15.
 */
@Component(value = "urlPathToClassScanner")
public class UrlPathToClassScanner implements UrlPathToClassMapper {
    @Value("com.mode")
    private String packageToScan;

    @Override
    public <T extends BaseEntity> Class<T> getEntityByPath(String path) {
        return null;
    }
}
