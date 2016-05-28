package com.kraynov.factory_method.example;

/**
 * Product. Root for hierarchy of objects which will be created in application.
 */
public abstract class Warrior {
    
    enum WarriorType {Infantryman, Archer, Horseman};
    
    static Warrior createWarrior(WarriorType type){
        Warrior w = null;
        switch(type){
            case Infantryman: w = new Infantryman(); break;
            case Archer: w = new Archer(); break;
            case Horseman: w = new Horseman(); break;
        }
        return w;   
    }
    
    protected int x, y; //coordinates
    
    public abstract void move(int shiftX, int shiftY);
    
    public abstract void attack(int shiftX, int shiftY);
    
}
