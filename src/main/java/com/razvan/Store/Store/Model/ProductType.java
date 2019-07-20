package com.razvan.Store.Store.Model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_TYPE")
public class ProductType {

    @Column(name = "PRODUCT_TYPE_ID")
    @Id
    @GeneratedValue
    Integer productTypeId;

    @Column(name = "PRODUCT_TYPE_NAME")
    String productTypeName;

    @Column(name = "DESCRIPTION")
    String description;

    public ProductType() {
    }

    public ProductType(Integer productTypeId, String productTypeName, String description) {
        this.productTypeId = productTypeId;
        this.productTypeName = productTypeName;
        this.description = description;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
