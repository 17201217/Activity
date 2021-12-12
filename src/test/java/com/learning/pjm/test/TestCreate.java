package com.learning.pjm.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.junit.Test;


public class TestCreate {
    /**
     * 生成 activiti的数据库表
     */
    @Test
    public void testCreateDbTable() {
        // 使用classpath下的activiti.cfg.xml中的配置创建processEngine，
        // 注意默认方式时，activiti.cfg.xml中id叫processEngineConfiguration，class叫StandaloneProcessEngineConfiguration
        /*ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment();
        System.out.println(processEngine);*/
        // 一般创建方式
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = configuration.buildProcessEngine();
        System.out.println(processEngine);

    }
}
