package com.kraynov.factory_method.concept;

/**
 * 
 */
public class ConcreteCreatorA extends Creator{

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
    
}
