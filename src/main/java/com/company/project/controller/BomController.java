package com.company.project.controller;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Bom;
import com.company.project.service.BomService;
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
@RequestMapping("/bom")
public class BomController {
    @Resource
    private BomService bomService;

    @PostMapping("/add")
    @ResponseBody
    public Result add(Bom bom) {
        bomService.save(bom);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    @ResponseBody
    public Result delete(@RequestParam Integer id) {
        bomService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    @ResponseBody
    public Result update(Bom bom) {
        bomService.update(bom);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    @ResponseBody
    public Result detail(@RequestParam Integer id) {
        Bom bom = bomService.findById(id);
        return ResultGenerator.genSuccessResult(bom);
    }

    @RequestMapping("/list")
    @ResponseBody
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<Bom> list = bomService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
