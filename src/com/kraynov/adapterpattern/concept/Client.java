package com.kraynov.adapterpattern.concept;

/**
 * Client class. This component needs to use object with interface Target
 */
public class Client 
{
       
    public void someClientOperation(Target target)
    {
        //do some actions
        Object response = target.request();
        //do some actions
    }
}
