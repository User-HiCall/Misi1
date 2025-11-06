package com.pcbuilder.core;
public class Monitors extends Peripheral {
    public Monitors(int price,String name){
        super(price,name);
    }
    public void run(){
        System.out.println("monitor jalan");
    }

}
