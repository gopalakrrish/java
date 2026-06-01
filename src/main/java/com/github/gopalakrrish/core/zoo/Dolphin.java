package com.github.gopalakrrish.core.zoo;

import java.io.Serializable;
import java.util.Scanner;

public class Dolphin extends Animal implements Swim, Serializable {
    String color;
    int swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed);
    }

    @Override
    public void setProperties(Scanner keyboard) {

        keyboard.nextLine();

        System.out.println("Enter the color of the dolphin:");
        setColor(keyboard.nextLine());

        System.out.println("Enter the speed of the dolphin:");
        setSwimmingSpeed(keyboard.nextInt());
    }

    @Override
    public void displayProperties() {

        System.out.println("The characteristics of the " + getNameOfAnimal() + ":");
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight());
        System.out.println("Color: " + getColor());
        System.out.println("Speed: " + getSwimmingSpeed());
    }

    @Override
    public void displayMovement() {
        swimming();
    }


    @Override
    public String toString() {
        return "Dolphin{" +
                "color='" + color + '\'' +
                ", swimmingSpeed=" + swimmingSpeed +
                '}';
    }
}
