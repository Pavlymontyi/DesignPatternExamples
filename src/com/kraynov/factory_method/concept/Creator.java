package com.kraynov.factory_method.concept;

/**
 * Interface of factory. This class declares ability to create products - 
 * objects of Product hierarchy.
 */
public abstract class Creator {
    
    public abstract Product factoryMethod();
    
}
