package com.example.josh.week1day5test;

public abstract class Animal {
    int energy = 20;
    String species;

    public Animal(){
        species = "animal";
    }

    public Animal(String spec){
        species = spec;
    }

    abstract void call();

    public void eat(Food food){
        System.out.println("A " + species + " ate " + food.type);
        setEnergy(5);
        System.out.println("Animal has " + getEnergy() + " energy left.");
    }

    public void sleep(){
        System.out.println("A " + species + " slept");
        setEnergy(10);
        System.out.println("Animal has " + getEnergy() + " energy left.");
    }

    public int getEnergy(){
        return energy;
    }

    public void setEnergy(int v){
        energy = energy + v;
    }

    public void setSpecies(String str){
        species = str;
    }

    public String toString(){
        call();
        return "It has " + energy + " energy left";
    }
}
