package com.learning.pjm.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;

/**
 * 新增流程部署测试类
 */
public class ActivityDemo {

    /**
     * 单个文件部署方式，部署流程定义
     */
    @Test
    public void testDeployment() {
        // 1.创建ProcssEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // 2.得到Repository实例
        RepositoryService repositoryService = processEngine.getRepositoryService();
        // 3.使用RepositoryService进行部署
        Deployment deployment  = repositoryService.createDeployment()
                .addClasspathResource("bpmn/evction.bpmn")
                .addClasspathResource("photo/evction.png")
                .name("出差申请流程")
                .deploy();
        // 4.输出部署信息
        System.out.println("流程部署id：" + deployment.getId());
        System.out.println("流程部署名称：" + deployment.getName());
    }
}
