package com.company;

public class GenericClass <T extends Number>
        implements GenericInterface<T>{

        private T model;
        private T text;

        @Override
        public T getModel () {
        return model;
    }

        public T getText () {
        return text;
    }

        @Override
        public void setModel (T model){
        this.model =model;

    }

        @Override
        public void setText (T text){
        this.text =text;

    }


    public void setModel() {
    }

    public void getModel() {
    }