package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuestServices extends Building {


    private boolean hasBathrooms;
    private List<String> servicesOffered = new ArrayList<>();

    public GuestServices(String name, boolean hasAnimals, boolean hasBathrooms, List<String> newServices){
        super(name, hasAnimals);
        this.hasBathrooms = hasBathrooms;
        servicesOffered.addAll(newServices);
    }

    public void outputDetails() {
        super.outputDetails();
        System.out.print("The "+getName()+" ");
        if(hasBathrooms)
            System.out.print("does have bathrooms. ");
        else
            System.out.print("does not have bathrooms. ");
        System.out.println("The following services are offered here: "+oneString(servicesOffered) + ".");

    }

}