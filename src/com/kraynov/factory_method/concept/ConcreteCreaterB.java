package com.kraynov.factory_method.concept;

/**
 * 
 */
public class ConcreteCreaterB extends Creator{

    @Override
    public Product factoryMethod() {
       return new ConcreteProductB();
    }
    
}
