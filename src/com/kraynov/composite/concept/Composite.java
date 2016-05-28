package com.kraynov.composite.concept;

import java.util.LinkedList;
import java.util.List;

public class Composite implements Component{

    List<Component> childs = new LinkedList<Component>();
    
    @Override
    public void doSomething() {
        for (Component cmp : childs){
            cmp.doSomething();
        }
    }
    
    //Adds the graphic to the composition.
    public void add(Component graphic) {
        childs.add(graphic);
    }

    //Removes the graphic from the composition.
    public void remove(Component graphic) {
        childs.remove(graphic);
    }
    
    
    
}
