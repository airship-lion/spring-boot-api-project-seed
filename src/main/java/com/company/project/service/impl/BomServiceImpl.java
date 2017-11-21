package com.company.project.service.impl;

import com.company.project.dao.BomMapper;
import com.company.project.model.Bom;
import com.company.project.service.BomService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/11/21.
 */
@Service
@Transactional
public class BomServiceImpl extends AbstractService<Bom> implements BomService {
    @Resource
    private BomMapper bomMapper;

}
