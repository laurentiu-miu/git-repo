package com.dclm.web;

import com.dclm.components.UrlPathToClassMapper;
import com.dclm.services.BaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by miulaurctin on 20/04/15.
 */
@Controller
@RequestMapping("crud/{baseEntity}")
public class CrudController {

    @Resource(name = "baseService")
    private BaseService baseService;

    @Resource(name = "urlPathToClassMapper")
    private UrlPathToClassMapper
}
