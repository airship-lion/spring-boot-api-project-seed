package com.company.project.model;

import javax.persistence.*;

@Table(name = "bom_item")
public class BomItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 物料名称
     */
    private String name;

    /**
     * 物料类别
     */
    @Column(name = "materials_type")
    private Integer materialsType;

    /**
     * 图号
     */
    @Column(name = "pic_no")
    private String picNo;

    /**
     * 材料规格描述
     */
    @Column(name = "mat_spec_desc")
    private String matSpecDesc;

    /**
     * 净重
     */
    private String weight;

    /**
     * 用量
     */
    private String amount;

    /**
     * 单位
     */
    private String unit;

    /**
     * 工艺
     */
    private String crafts;

    /**
     * 开模费用/万
     */
    @Column(name = "mold_cost")
    private String moldCost;

    /**
     * 产品单价/元
     */
    @Column(name = "product_price")
    private String productPrice;

    /**
     * 食品安全等级认证
     */
    @Column(name = "food_safety_certification")
    private String foodSafetyCertification;

    /**
     * 供应厂商
     */
    @Column(name = "supply_company")
    private String supplyCompany;

    /**
     * 备注
     */
    private String remark;

    /**
     * bom表id
     */
    @Column(name = "bom_id")
    private Integer bomId;

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
     * 获取物料名称
     *
     * @return name - 物料名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置物料名称
     *
     * @param name 物料名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取物料类别
     *
     * @return materials_type - 物料类别
     */
    public Integer getMaterialsType() {
        return materialsType;
    }

    /**
     * 设置物料类别
     *
     * @param materialsType 物料类别
     */
    public void setMaterialsType(Integer materialsType) {
        this.materialsType = materialsType;
    }

    /**
     * 获取图号
     *
     * @return pic_no - 图号
     */
    public String getPicNo() {
        return picNo;
    }

    /**
     * 设置图号
     *
     * @param picNo 图号
     */
    public void setPicNo(String picNo) {
        this.picNo = picNo;
    }

    /**
     * 获取材料规格描述
     *
     * @return mat_spec_desc - 材料规格描述
     */
    public String getMatSpecDesc() {
        return matSpecDesc;
    }

    /**
     * 设置材料规格描述
     *
     * @param matSpecDesc 材料规格描述
     */
    public void setMatSpecDesc(String matSpecDesc) {
        this.matSpecDesc = matSpecDesc;
    }

    /**
     * 获取净重
     *
     * @return weight - 净重
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置净重
     *
     * @param weight 净重
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取用量
     *
     * @return amount - 用量
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 设置用量
     *
     * @param amount 用量
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 获取单位
     *
     * @return unit - 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位
     *
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取工艺
     *
     * @return crafts - 工艺
     */
    public String getCrafts() {
        return crafts;
    }

    /**
     * 设置工艺
     *
     * @param crafts 工艺
     */
    public void setCrafts(String crafts) {
        this.crafts = crafts;
    }

    /**
     * 获取开模费用/万
     *
     * @return mold_cost - 开模费用/万
     */
    public String getMoldCost() {
        return moldCost;
    }

    /**
     * 设置开模费用/万
     *
     * @param moldCost 开模费用/万
     */
    public void setMoldCost(String moldCost) {
        this.moldCost = moldCost;
    }

    /**
     * 获取产品单价/元
     *
     * @return product_price - 产品单价/元
     */
    public String getProductPrice() {
        return productPrice;
    }

    /**
     * 设置产品单价/元
     *
     * @param productPrice 产品单价/元
     */
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 获取食品安全等级认证
     *
     * @return food_safety_certification - 食品安全等级认证
     */
    public String getFoodSafetyCertification() {
        return foodSafetyCertification;
    }

    /**
     * 设置食品安全等级认证
     *
     * @param foodSafetyCertification 食品安全等级认证
     */
    public void setFoodSafetyCertification(String foodSafetyCertification) {
        this.foodSafetyCertification = foodSafetyCertification;
    }

    /**
     * 获取供应厂商
     *
     * @return supply_company - 供应厂商
     */
    public String getSupplyCompany() {
        return supplyCompany;
    }

    /**
     * 设置供应厂商
     *
     * @param supplyCompany 供应厂商
     */
    public void setSupplyCompany(String supplyCompany) {
        this.supplyCompany = supplyCompany;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取bom表id
     *
     * @return bom_id - bom表id
     */
    public Integer getBomId() {
        return bomId;
    }

    /**
     * 设置bom表id
     *
     * @param bomId bom表id
     */
    public void setBomId(Integer bomId) {
        this.bomId = bomId;
    }
}