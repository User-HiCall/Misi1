package com.pcbuilder.core;

public class Component {
    protected int price;
    protected String name;

    public Component(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName(){
        return name;
    }
}