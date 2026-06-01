package com.github.gopalakrrish.core.zoo;

import java.io.Serializable;
import java.util.Scanner;

public class Tiger extends Animal implements Walk, Serializable {
    int numberOfStripes;
    int speed;
    int soundLevel;

    public Tiger(){
        super("Tiger");
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed " + speed);
    }

    @Override
    public void setProperties(Scanner keyboard) {

        System.out.println("Enter the number of Stripes:");
        setNumberOfStripes(keyboard.nextInt());

        System.out.println("Enter speed:");
        setSpeed(keyboard.nextInt());

        System.out.println("Enter decibel of roar:");
        setSoundLevel(keyboard.nextInt());
    }

    @Override
    public void displayProperties() {

        System.out.println("The characteristics of the " + getNameOfAnimal() + ":");
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight());
        System.out.println("Number of stripes: " + getNumberOfStripes());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Sound level of roar: " + getSoundLevel());
    }

    @Override
    public void displayMovement() {
        walking();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "numberOfStripes=" + numberOfStripes +
                ", speed=" + speed +
                ", soundLevel=" + soundLevel +
                '}';
    }
}
