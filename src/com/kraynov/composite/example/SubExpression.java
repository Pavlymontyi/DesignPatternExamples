package com.kraynov.composite.example;

// Единообразный интерфейс доступа к листовым и контейнерным объектам
public interface SubExpression {
    
    public Number value();
  
    public void add(SubExpression expr);
    public void sub(SubExpression expr);
    public SubExpression getSubExpression(int index);
}
