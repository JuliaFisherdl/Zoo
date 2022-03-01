package com.company;


    public class Penguin extends Animal {

        private String color;
        private boolean isEndangered;

        public Penguin(String name, String type, String color, boolean isEndangered) {
            super(name, type);
            this.color = color;
            this.isEndangered = isEndangered;
        }

        public void outputDetails() {
            super.outputDetails();
            if (isEndangered)
                System.out.print(". He is an endangered animal ");
            else
                System.out.print(". He is not and endangered animal ");

            System.out.println("The Penguin and is " + color + ".");

        }
    }

