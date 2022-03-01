package com.company;

import java.util.ArrayList;
import java.util.List;

    public class AnimalEnclosure extends Building {


        private List<Animal> animals = new ArrayList<>();
        private boolean hasCages;
        private boolean hasBenches;

        public AnimalEnclosure(String name, boolean hasAnimals, List<Animal> newAnimals, boolean hasFlowingWater, boolean openTop) {
            super(name, hasAnimals);
            animals.addAll(newAnimals);
            this.hasCages = hasCages;
            this.hasBenches = hasBenches;
        }

        public void outputDetails() {
            String animalsString = "";

            for (int i = 0; i < animals.size(); i++) {
                animalsString = animalsString.concat(animals.get(i).getClassName());
                if (animals.size() > 1 && i < animals.size() - 1)
                    animalsString = animalsString.concat(", ");
            }


            super.outputDetails();
            System.out.print("The " + getName() + " ");
            if (hasCages)
                System.out.print("does have cages, and ");
            else
                System.out.print("does not have cages, and ");

            if (hasBenches)
                System.out.println("the buidling has benches.");
            else
                System.out.println("the building does not have benches.");

            System.out.println("The following animals are here: " + animalsString);
        }
    }

