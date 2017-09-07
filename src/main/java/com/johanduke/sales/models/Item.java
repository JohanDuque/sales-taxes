package com.johanduke.sales.models;

public class Item implements Importable {

    private boolean isImported;

    private ItemCategory category = ItemCategory.ANY_GOOD;

    private String name = ""; //I'm initializing an empty name in order to avoid to deal with null values

    private double price;

    public Item() { /*Default constructor*/ }

    public Item(boolean isImported, ItemCategory category, String name, double price) {
        this.isImported = isImported;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Item(boolean isImported, String name, double price) {
        this.isImported = isImported;
        this.name = name;
        this.price = price;
    }

    public Item(ItemCategory category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isImported() {
        return isImported;
    }
}
