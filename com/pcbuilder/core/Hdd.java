package com.pcbuilder.core;
public class Hdd extends Storage {
    public Hdd(int price,String name) {
        super(price, name);
    }
    public void store(){
        System.out.println("simpan ke HDD");
    }  
}
