package com.company.project.controller;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BomItem;
import com.company.project.service.BomItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/11/21.
*/
@Controller
@RequestMapping("/bom/item")
public class BomItemController {
    @Resource
    private BomItemService bomItemService;

    @PostMapping("/add")
    @ResponseBody
    public Result add(BomItem bomItem) {
        bomItemService.save(bomItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    @ResponseBody
    public Result delete(@RequestParam Integer id) {
        bomItemService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    @ResponseBody
    public Result update(BomItem bomItem) {
        bomItemService.update(bomItem);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    @ResponseBody
    public Result detail(@RequestParam Integer id) {
        BomItem bomItem = bomItemService.findById(id);
        return ResultGenerator.genSuccessResult(bomItem);
    }

    @RequestMapping("/list")
    @ResponseBody
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<BomItem> list = bomItemService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
