package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Giraffe("Jeffrey", "mammal", "dark brown", false));
        animalList.add(new Penguin("Chilly Willy", "bird", "black/white",false));

        List<String> services = new ArrayList<>();
        services.add("stroller rental");
        services.add("wheelchair rental");
        services.add("lost and found");

        Animal animal1 = new Animal("Simba", "mammal");

        Monkey monkey1 = new Monkey("Curious George", "mammal", "brown", false);

        Building building1 = new Building("bathroom", false);
        AnimalEnclosure enclosure1 = new AnimalEnclosure("Polk Penguin Conservation Center", true, animalList, false, true);
        GuestServices informationBooth = new GuestServices("Information Booth", false, true, services);

        animal1.outputDetails();
        monkey1.outputDetails();
        for(int i=0; i<animalList.size(); i++){
            animalList.get(i).outputDetails();
        }


        building1.outputDetails();
        enclosure1.outputDetails();
        informationBooth.outputDetails();
    }
}