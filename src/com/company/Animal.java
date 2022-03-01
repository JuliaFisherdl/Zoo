package com.company;

public class Animal {

    private String name;
    private String type;


    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public void outputDetails(){
        System.out.println("");
        System.out.print(name+" is a " + type);
    }

    public String getClassName(){
        return getClass().getSimpleName();
    }

}