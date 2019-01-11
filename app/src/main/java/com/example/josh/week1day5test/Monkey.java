package com.example.josh.week1day5test;

public class Monkey extends Animal{

    int pop;

    public Monkey(){
        setSpecies("monkey");
        pop = Jungle.setMonkeyPop();
    }

    @Override
    public void call(){
        setEnergy(-4);
        System.out.println("Monkey says Oooo");
        System.out.println("Animal has " + getEnergy() + " energy left.");
    }

    @Override
    public void eat(Food food){
        setEnergy(2);
        System.out.println("A " + species + " ate " + food.type);
        System.out.println("Animal has " + getEnergy() + " energy left.");
    }

    public void play(){
        if(getEnergy()<=7){
            System.out.println("Monkey is too tired");
        } else {
            setEnergy(-8);
            System.out.println("Oooo Oooo Oooo");
            System.out.println("Animal has " + getEnergy() + " energy left.");
        }
    }
}
