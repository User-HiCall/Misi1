package com.pcbuilder.core;

public class Cpu extends MainComponent {
    public Cpu (int price, String name) {
        super(price, name);
    }

    public void process() {
        System.out.println("Cpu Online");
    }
}