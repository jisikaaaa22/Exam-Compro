package com.example.coffee;

public class Coffee {
    private int id;
    private String name;
    private String type;
    private String size;
    private double price;

    public Coffee(int id, String name, String type, String size, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public String getSize() { return size; }
    public double getPrice() { return price; }
}