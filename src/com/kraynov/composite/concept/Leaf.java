package com.kraynov.composite.concept;

public class Leaf implements Component{

    @Override
    public void doSomething() {
        System.out.println("Leaf:: doSomething");
    }
    
}
