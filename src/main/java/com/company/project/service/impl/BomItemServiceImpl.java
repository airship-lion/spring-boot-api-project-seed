package com.company.project.service.impl;

import com.company.project.dao.BomItemMapper;
import com.company.project.model.BomItem;
import com.company.project.service.BomItemService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/11/21.
 */
@Service
@Transactional
public class BomItemServiceImpl extends AbstractService<BomItem> implements BomItemService {
    @Resource
    private BomItemMapper bomItemMapper;

}
