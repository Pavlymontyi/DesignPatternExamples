package com.kraynov.composite.concept;

import javax.swing.JPanel;

public class Client {
    
    public static void main(String... args){
        Leaf ellipse1 = new Leaf();
        Leaf ellipse2 = new Leaf();
        Leaf ellipse3 = new Leaf();
        Leaf ellipse4 = new Leaf();

        //Initialize three composite graphics
        Composite graphic = new Composite();
        Composite graphic1 = new Composite();
        Composite graphic2 = new Composite();

        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        //Prints the complete graphic (four times the string "Ellipse").
        graphic.doSomething();
        
    }
}
