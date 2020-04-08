package com.example.demo;

public class MyObject {
    private Integer value;
    private String category;
    private String material;

    public MyObject(Integer value, String category, String material) {
        this.value = value;
        this.category = category;
        this.material = material;
    }

    public Integer getValue() {
        return value;
    }

    public String getCategory() {
        return category;
    }

    public String getMaterial() {
        return material;
    }
}
