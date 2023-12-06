package com.company;

public class Snack {
    private String name;
    private Double price;
    private Integer amountInStock;

    public Snack(String name, Double price, Integer amountInStock)
    {
        this.name = name;
        this.price = price;
        this.amountInStock = amountInStock;
    }

    public int updateStock(int amount)
    {
        return this.amountInStock -= amount;
    }

    public boolean checkStock(int amount)
    {
        return this.amountInStock >= amount;
    }

    public double totalPrice(int amount)
    {
        return amount * this.price;
    }

    public String displaySnack()
    {
        return this.name + " price: " + this.price + "$. " + this.amountInStock + " are left.";
    }
}
