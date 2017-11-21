package com.company.project.controller;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Dict;
import com.company.project.service.DictService;
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
@RequestMapping("/dict")
public class DictController {
    @Resource
    private DictService dictService;

    @PostMapping("/add")
    @ResponseBody
    public Result add(Dict dict) {
        dictService.save(dict);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    @ResponseBody
    public Result delete(@RequestParam Integer id) {
        dictService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    @ResponseBody
    public Result update(Dict dict) {
        dictService.update(dict);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    @ResponseBody
    public Result detail(@RequestParam Integer id) {
        Dict dict = dictService.findById(id);
        return ResultGenerator.genSuccessResult(dict);
    }

    @RequestMapping("/list")
    @ResponseBody
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<Dict> list = dictService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
