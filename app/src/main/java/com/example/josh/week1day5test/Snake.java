package com.example.josh.week1day5test;

public class Snake extends Animal{

    int pop;

    public Snake(){
        setSpecies("snake");
        pop = Jungle.setSnakePop();
    }

    @Override
    void call() {
        setEnergy(-3);
        System.out.println("Snake says ssssss.");
        System.out.println("Animal has " + getEnergy() + " energy left.");

    }
}
