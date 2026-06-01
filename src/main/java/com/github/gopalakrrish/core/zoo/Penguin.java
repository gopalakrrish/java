package com.github.gopalakrrish.core.zoo;

import java.io.Serializable;
import java.util.Scanner;

public class Penguin extends Animal implements Walk, Swim, Serializable {
    boolean isSwimming;
    int walkSpeed;
    int swimSpeed;

    public Penguin() {
        super("Penguin");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }


    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }

    @Override
    public void setProperties(Scanner keyboard) {

        System.out.println("Is the penguin swimming (true/false):");
        setSwimming(keyboard.nextBoolean());

        System.out.println("Enter the walk speed:");
        setWalkSpeed(keyboard.nextInt());

        System.out.println("Enter the swim speed:");
        setSwimSpeed(keyboard.nextInt());
    }

    @Override
    public void displayProperties() {

        System.out.println("The characteristics of the " + getNameOfAnimal() + ":");
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight());
        System.out.println("Walking Speed: " + getWalkSpeed());
        System.out.println("Swimming Speed: " + getSwimSpeed());
    }

    @Override
    public void displayMovement() {

        if (isSwimming()) {
            swimming();
        } else {
            walking();
        }
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "isSwimming=" + isSwimming +
                ", walkSpeed=" + walkSpeed +
                ", swimSpeed=" + swimSpeed +
                '}';
    }
}