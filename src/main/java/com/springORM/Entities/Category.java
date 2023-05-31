package com.springORM.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_category")
public class Category
{
    @Id
    private String cId;
    private String title;
    @ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Product> productList= new ArrayList<>();

    public Category() {
    }

    public Category(String cId, String title, List<Product> productList) {
        this.cId = cId;
        this.title = title;
        this.productList = productList;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cId='" + cId + '\'' +
                ", title='" + title + '\'' +
                ", productList=" + productList +
                '}';
    }
}
