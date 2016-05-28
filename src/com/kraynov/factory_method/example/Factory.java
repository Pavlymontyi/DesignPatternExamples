package com.kraynov.factory_method.example;

/**
 * Interface of factory. This class declares ability to create products - 
 * objects of Product hierarchy.
 */
public abstract class Factory {
    
    /* Factory method to create Warrior object */
    public abstract Warrior createWarrior();
    
}
