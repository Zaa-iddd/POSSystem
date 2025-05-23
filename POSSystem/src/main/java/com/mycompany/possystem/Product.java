
package com.mycompany.possystem;

public class Product {
    
    private int id;
    private String name;
    private double price;
    private Category category;

    public enum Category{
        DRINK,FOOD,DESSERT
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     public void setCategory(Category category) {
        this.category = category;
    }
    
}
