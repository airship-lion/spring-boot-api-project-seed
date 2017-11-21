package com.company.project.model;

import javax.persistence.*;

public class Dict {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 字典名称
     */
    private String name;

    /**
     * 字典类别
     */
    private String type;

    /**
     * 排序,值小排前面
     */
    private Integer sort;

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
     * 获取字典名称
     *
     * @return name - 字典名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字典名称
     *
     * @param name 字典名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取字典类别
     *
     * @return type - 字典类别
     */
    public String getType() {
        return type;
    }

    /**
     * 设置字典类别
     *
     * @param type 字典类别
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取排序,值小排前面
     *
     * @return sort - 排序,值小排前面
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序,值小排前面
     *
     * @param sort 排序,值小排前面
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}