package com.conpany.project;

import com.company.project.model.Project;
import com.company.project.service.ProjectService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 * Desc
 */

public class ProjectTest extends Tester {
    @Autowired
    private ProjectService projectService;
    @Test
    public void testBatchInsert(){
        List<Project> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            Project project = new Project();
            project.setNo("NO"+(i+23));
            project.setName("项目"+(i+23));
            list.add(project);
        }
        projectService.save(list);
    }
}
