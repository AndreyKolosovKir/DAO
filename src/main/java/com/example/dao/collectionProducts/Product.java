package com.example.dao.collectionProducts;

public class Product {

    private int id;

    private String product;

    public Product(int id, String product) {
        this.id = id;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", product='" + product + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
