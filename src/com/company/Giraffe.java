package com.company;


public class Giraffe extends Animal{

    private String color;
    private boolean isEndangered;

    public Giraffe(String name, String type, String color, boolean isEndangered){
        super(name, type);
        this.color = color;
        this.isEndangered = isEndangered;
    }

    public void outputDetails(){
        super.outputDetails();
        if(isEndangered)
            System.out.print(". He is an endangered animal ");
        else
            System.out.print(". He is not and endangered animal. ");

        System.out.println("The Giraffe and is "+color+".");

    }
}
