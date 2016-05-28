package com.kraynov.factory_method.example;

/**
 *
 * @author kraynov
 */
public class HorsemanCreator extends Factory{

    @Override
    public Warrior createWarrior() {
        return new Horseman();
    }
    
}
