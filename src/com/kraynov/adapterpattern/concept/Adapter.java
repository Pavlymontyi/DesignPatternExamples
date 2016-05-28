package com.kraynov.adapterpattern.concept;

/**
 * 
 */
public class Adapter implements Target{

    Adaptee adaptee;
    
    Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    
    @Override
    public Object request() {
        return adaptee.specificRequest();
    }
    
}
