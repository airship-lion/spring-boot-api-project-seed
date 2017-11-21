package com.conpany.project;

import com.company.project.model.Dict;
import com.company.project.model.Project;
import com.company.project.service.DictService;
import com.company.project.service.ProjectService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 * Desc
 */

public class DictTest extends Tester {
    @Autowired
    private DictService dictService;

    @Test
    public void testBatchInsert() {
        List<Dict> list = new ArrayList<>();
        String[] names = {"塑料件", "五金件", "电子件", "外购件", "包材/辅料"};
        for (int i = 0; i < 5; i++) {
            createDict(list, i, names[i]);
        }
        dictService.save(list);
    }

    private void createDict(List<Dict> list, int i, String name) {
        Dict dict = new Dict();
        dict.setName(name);
        dict.setSort(i + 1);
        dict.setType("bom_materials_type");
        list.add(dict);
    }
}
