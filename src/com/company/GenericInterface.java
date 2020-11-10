package com.company;

public interface GenericInterface<T> {
       T getModel();
       T getText();
    void setModel( T model);
    void setText( T text);
}
