package com.kraynov.factory_method.example;

/**
 *
 * @author kraynov
 */
public class InfantrymanCreator extends Factory{

    @Override
    public Warrior createWarrior() {
        return new Infantryman();
    }
}
