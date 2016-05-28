package com.kraynov.factory_method.example;

/**
 * ConcreteProductC. One of concrete classes.
 */
public class Archer extends Warrior{

    protected int R; //Radius of attack
    
    @Override
    public void move(int shiftX, int shiftY) {
        if (Math.sqrt(shiftX*shiftX + shiftY+shiftY) > 1) return; 
        //Infantryman can move to three cell
        x += shiftX;
        y += shiftY;
    }

    @Override
    public void attack(int shiftX, int shiftY) {
        //some attack actions specific for Horseman
    }
    
    @Override
    public String toString(){
        return "Archer: (x, y)=("+x+", "+y+"), R="+R;
    }
    
}
