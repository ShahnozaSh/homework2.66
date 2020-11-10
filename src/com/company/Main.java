package com.company;

public class Main {

    public static void main(String[] args) {

        GenericClass<Integer> genericClass= new GenericClass();
        genericClass.setModel(1990);
        System.out.println(genericClass.getModel());

        GenericClass<Float> genericClass1 = new GenericClass();
        genericClass1.setText((float) 1991);
        System.out.println(genericClass1.getText());
    }
}
