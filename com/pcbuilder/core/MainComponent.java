package com.pcbuilder.core;
public abstract class MainComponent extends Component {
    protected int price;
    protected String name;

    public MainComponent(int price, String name) {
        super(price, name);
    }

    public void process() {
    }
}