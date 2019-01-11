package com.example.josh.week1day5test;

public class Tiger extends Animal {

    int pop;

    Tiger(){
        setSpecies("tiger");
        pop = Jungle.setTigerPop();
    }

    @Override
    void call() {
        setEnergy(-3);
        System.out.println("Tiger says Rawr.");
        System.out.println("Animal has " + getEnergy() + " energy left.");
    }

    @Override
    public void sleep(){
        System.out.println("A " + species + " slept");
        setEnergy(5);
        System.out.println("Animal has " + getEnergy() + " energy left.");
    }

    @Override
    public void eat(Food food){
        if(food.type.equals("grain")){
            System.out.println("Tigers don't eat grain!");
        } else {
            System.out.println("A " + species + " ate " + food.type);
            setEnergy(5);
            System.out.println("Animal has " + getEnergy() + " energy left.");
        }
    }

}
