package com.kraynov.factory_method.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 */
public class Main {
    
    public static void main(String[] args){
        
        //classic implementation
        InfantrymanCreator creator1 = new InfantrymanCreator();
        HorsemanCreator creator2 = new HorsemanCreator();
        ArcherCreator creator3 = new ArcherCreator();
        
        Collection<Warrior> carfagenWarriors = new LinkedList<Warrior>();
        carfagenWarriors.add(creator1.createWarrior());
        carfagenWarriors.add(creator2.createWarrior());
        carfagenWarriors.add(creator3.createWarrior());
        
        for (Warrior w : carfagenWarriors){
            System.out.println(w);
        }
        
        //static constructor implementation
        Collection<Warrior> romeWarriors = new LinkedList<Warrior>();
        romeWarriors.add(Warrior.createWarrior(Warrior.WarriorType.Archer));
        romeWarriors.add(Warrior.createWarrior(Warrior.WarriorType.Horseman));
        romeWarriors.add(Warrior.createWarrior(Warrior.WarriorType.Infantryman));
        
        for (Warrior w : romeWarriors){
            System.out.println(w);
        }
        
        
        
    }
}
