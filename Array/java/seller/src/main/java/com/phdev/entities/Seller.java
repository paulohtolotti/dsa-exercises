package com.phdev.entities;

public class Seller {
    private String name;
    private Double amount;

    public Seller() {

    }
    
    public Seller(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Seller [name=" + name + ", amount=" + amount + "]";
    }

    
}
