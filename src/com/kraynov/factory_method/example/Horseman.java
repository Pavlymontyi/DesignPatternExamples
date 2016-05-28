package com.kraynov.factory_method.example;

/**
 * ConcreteProductB. One of concrete classes.
 */
public class Horseman extends Warrior{

    protected int M;
    
    @Override
    public void move(int shiftX, int shiftY) {
        if (Math.sqrt(shiftX*shiftX + shiftY+shiftY) > M) return; 
        //Infantryman can move to M cell
        x += shiftX;
        y += shiftY;
    }
    
    @Override
    public void attack(int shiftX, int shiftY) {
        //some attack actions specific for Horseman
        move(shiftX, shiftY);
    }
    
    @Override
    public String toString(){
        return "Horseman: (x, y)=("+x+", "+y+"), M="+M;
    }
}
