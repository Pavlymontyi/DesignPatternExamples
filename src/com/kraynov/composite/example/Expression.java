package com.kraynov.composite.example;

// Выражение - контейнер

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expression implements SubExpression {

    private List<SubExpression> exprs;
    
    public Expression(SubExpression... exprs) {
        this.exprs = Arrays.asList(exprs);
    }
  
    @Override
    public Number value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(SubExpression expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sub(SubExpression expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SubExpression getSubExpression(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
