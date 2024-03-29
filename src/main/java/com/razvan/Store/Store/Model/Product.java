package com.razvan.Store.Store.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Column(name = "PRODUCT_ID")
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer productId;

    @Column(name = "PRODUCT_NAME")
    String productName;

    @Column(name = "PRODUCT_PRICE")
    Double productPrice;

    @Column(name = "COLOR")
    String color;

    @Column(name = "IS_AVAILABLE")
    boolean isAvailable;

    @Column(name = "EXPIRATION_DATE")
    Date expirationDate;

    @Column(name = "PRODUCT_TYPE")
    Integer productType;

    public Product() {
    }

    public Product(Integer productId, String productName, Double productPrice, String color, boolean isAvailable, Date expirationDate, Integer productType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.color = color;
        this.isAvailable = isAvailable;
        this.expirationDate = expirationDate;
        this.productType = productType;
    }

    public Integer getProductId() {
        return productId;
    }

    public Product getProductByName(String productName) {
        if (this.productName.equals(productName)) {
            return this;
        }
        return null;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }
}
