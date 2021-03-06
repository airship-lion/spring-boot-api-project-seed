package com.company.project.service.impl;

import com.company.project.dao.DictMapper;
import com.company.project.model.Dict;
import com.company.project.service.DictService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/11/21.
 */
@Service
@Transactional
public class DictServiceImpl extends AbstractService<Dict> implements DictService {
    @Resource
    private DictMapper dictMapper;

}
