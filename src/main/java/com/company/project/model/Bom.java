package com.company.project.model;

import javax.persistence.*;

public class Bom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     *  产品名称
     */
    private String name;

    /**
     * 电压/频率/功率
     */
    private String voltage;

    /**
     * 客户
     */
    private String client;

    /**
     * 认证
     */
    private String certification;

    private Boolean rohs;

    private Boolean reach;

    /**
     * 项目表id
     */
    @Column(name = "project_id")
    private Integer projectId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 产品名称
     *
     * @return name -  产品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 产品名称
     *
     * @param name  产品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取电压/频率/功率
     *
     * @return voltage - 电压/频率/功率
     */
    public String getVoltage() {
        return voltage;
    }

    /**
     * 设置电压/频率/功率
     *
     * @param voltage 电压/频率/功率
     */
    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    /**
     * 获取客户
     *
     * @return client - 客户
     */
    public String getClient() {
        return client;
    }

    /**
     * 设置客户
     *
     * @param client 客户
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * 获取认证
     *
     * @return certification - 认证
     */
    public String getCertification() {
        return certification;
    }

    /**
     * 设置认证
     *
     * @param certification 认证
     */
    public void setCertification(String certification) {
        this.certification = certification;
    }

    /**
     * @return rohs
     */
    public Boolean getRohs() {
        return rohs;
    }

    /**
     * @param rohs
     */
    public void setRohs(Boolean rohs) {
        this.rohs = rohs;
    }

    /**
     * @return reach
     */
    public Boolean getReach() {
        return reach;
    }

    /**
     * @param reach
     */
    public void setReach(Boolean reach) {
        this.reach = reach;
    }

    /**
     * 获取项目表id
     *
     * @return project_id - 项目表id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * 设置项目表id
     *
     * @param projectId 项目表id
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}