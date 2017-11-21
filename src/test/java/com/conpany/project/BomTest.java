package com.conpany.project;

import com.company.project.model.Bom;
import com.company.project.model.Project;
import com.company.project.service.BomService;
import com.company.project.service.ProjectService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 * Desc
 */

public class BomTest extends Tester {
    @Autowired
    private BomService bomService;

    @Test
    public void testBatchInsert() {
        List<Bom> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            Bom bom = new Bom();
            bom.setCertification("斯蒂芬" + i);
            bom.setClient("水电费" + i);
            bom.setName("密封圈" + i);
            bom.setReach(i % 3 == 0);
            bom.setRohs(i % 2 == 0);
            bom.setVoltage("说服力端口" + i);
            bom.setProjectId(163 + i);
            list.add(bom);
        }
        bomService.save(list);
    }

    @Test
    public void testBatchUpdate() {
        List<Bom> all = bomService.findAll();
        int i = 0;
        for (Bom bom : all) {
            i++;
            bom.setName("产品" + i);
            bomService.update(bom);
        }
    }
}
