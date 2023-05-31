package com.springORM.Entities;

import jakarta.persistence.*;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa_product")
public class Product
{
    @Id
    private String pId;
    private String product_name;
    //boolean active;
   // double price;
    @ManyToMany(mappedBy = "productList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Category> categoryList= new ArrayList<>();

    public Product() {
    }

    public Product(String pId, String product_name) {
        this.pId = pId;
        this.product_name = product_name;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId='" + pId + '\'' +
                ", product_name='" + product_name + '\'' +
                ", categoryList=" + categoryList +
                '}';
    }
}
