package com.kraynov.factory_method.example;

/**
 * ConcreteProductA. One of concrete classes.
 */
public class Infantryman extends Warrior{

    @Override
    public void move(int shiftX, int shiftY) {
        if (Math.sqrt(shiftX*shiftX + shiftY+shiftY) > 1) return; 
        //Infantryman can move only to one cell
        x += shiftX;
        y += shiftY;
    }

    @Override
    public void attack(int shiftX, int shiftY) {
        //some attack actions specific for Infantryman
        move(shiftX, shiftY);
    }

    @Override
    public String toString(){
        return "Infantryman: (x, y)=("+x+", "+y+")";
    }
    
}
