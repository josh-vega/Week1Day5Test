package com.example.josh.week1day5test;

import java.util.ArrayList;
import java.util.List;

public class Jungle {

    static int tigerPop = 0;
    static int snakePop = 0;
    static int monkeyPop = 0;


    public static void main(String[] args){
        List<Animal> animals = new ArrayList<Animal>();
        Food bugs = new Food("bugs");
        Food meat = new Food("meat");
        Food fish = new Food("fish");
        Food grain = new Food("grain");
        Animal tigger = new Tiger();
        animals.add(tigger);
        Animal sneak = new Snake();
        animals.add(sneak);
        Animal jake = new Snake();
        animals.add(jake);
        Animal dangerNoodle = new Snake();
        animals.add(dangerNoodle);
        Animal solid = new Snake();
        animals.add(solid);
        Animal momo = new Monkey();
        animals.add(momo);
        Animal sun = new Monkey();
        animals.add(sun);
        Animal fang = new Monkey();
        animals.add(fang);
        soundOff(animals);
        momo.eat(fish);
        tigger.eat(grain);
        jake.eat(meat);
        ((Monkey) fang).play();
        System.out.println("Monkey Pop: " + monkeyPop);
        tigger.eat(bugs);
        tigger.sleep();
        solid.sleep();

    }

    private static void soundOff(List<Animal> animals) {
        for(int i=0;i<animals.size();i++) {
            animals.get(i).toString();
        }
    }

    public static int setTigerPop(){
        tigerPop++;
        return tigerPop;
    }

    public static int setMonkeyPop(){
        monkeyPop++;
        return  monkeyPop;
    }

    public static int setSnakePop(){
        snakePop++;
        return  snakePop;
    }
}
