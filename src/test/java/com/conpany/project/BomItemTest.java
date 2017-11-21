package com.conpany.project;

import com.company.project.model.Bom;
import com.company.project.model.BomItem;
import com.company.project.service.BomItemService;
import com.company.project.service.BomService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 * Desc
 */

public class BomItemTest extends Tester {
    @Autowired
    private BomItemService bomItemService;
    @Test
    public void testBatchInsert(){
        List<BomItem> list = new ArrayList<>();
        for (int i = 0; i < 800; i++) {
            BomItem bomItem = new BomItem();
            bomItem.setAmount((1+i)+"");
            bomItem.setCrafts("1出"+(i+1));
            bomItem.setFoodSafetyCertification("LFGB");
            bomItem.setMaterialsType((i%5)+1);
            bomItem.setMatSpecDesc("硅胶  新料 黑色  "+(20)+"度");
            bomItem.setMoldCost("0."+(i+1));
            bomItem.setPicNo("S01-W00"+(i));
            bomItem.setProductPrice(""+(i+20));
            bomItem.setRemark("备注"+i);
            bomItem.setSupplyCompany("雅美");
            bomItem.setWeight((20+i)+"g");
            bomItem.setUnit("PCS");
            bomItem.setName("密封圈"+i);
            bomItem.setBomId((1+(i)/10));
            list.add(bomItem);
        }
        bomItemService.save(list);
    }
}
