package com.kraynov.factory_method.example;

/**
 *
 * @author kraynov
 */
public class ArcherCreator extends Factory{

    @Override
    public Warrior createWarrior() {
        return new Archer();
    }
    
}
