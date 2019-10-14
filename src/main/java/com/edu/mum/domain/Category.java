package com.edu.mum.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;

    @NotBlank(message = "Category Name is required")
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> productList;

    public Category() {

    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
