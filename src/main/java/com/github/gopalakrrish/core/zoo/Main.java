package com.github.gopalakrrish.core.zoo;

import java.io.*;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int continueOuterLoop = 1  ;


        Tiger tigerObject = new Tiger();

        Dolphin dolphinObject = new Dolphin();

        Penguin penguinObject = new Penguin();


        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    handleAnimal(keyboard, tigerObject);
                    break;

                case 2:
                    handleAnimal(keyboard, dolphinObject);
                    break;

                case 3:
                    handleAnimal(keyboard, penguinObject);
                    break;

                case 4:
                    writeObjectsToFile(tigerObject, penguinObject, dolphinObject);
                    break;

                case 5:
                    readObjectsFromFile();
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);

    }

    private static void handleAnimal(
            Scanner keyboard,
            Animal animal) {

        int continueInnerLoop;

        do {

            System.out.println(
                    "The animal which is chosen is : "
                            + animal.getNameOfAnimal());

            int menuChoice =
                    animalDetailsManipulationMenu(
                            keyboard,
                            animal);

            switch (menuChoice) {

                case 1:
                    animal.setProperties(keyboard);
                    break;

                case 2:
                    animal.displayProperties();
                    break;

                case 3:
                    animal.displayMovement();
                    break;

                case 4:
                    animal.displayEating();
                    break;

                default:
                    System.out.println("Not supported");
            }

            System.out.println(
                    "Continue with this animal? (1 = Yes, 2 = No)");

            continueInnerLoop = keyboard.nextInt();

        } while (continueInnerLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("4. Save animals to file");
        System.out.println("5. Display saved animals from file");
        System.out.println("Enter choice of animal (1-5):");

        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }

    private static void writeObjectsToFile(Tiger tiger, Penguin penguin, Dolphin dolphin) {
        try {
            ObjectOutputStream oosTiger = new ObjectOutputStream(new FileOutputStream("tiger.txt"));
            ObjectOutputStream oosPenguin = new ObjectOutputStream(new FileOutputStream("penguin.txt"));
            ObjectOutputStream oosDolphin = new ObjectOutputStream(new FileOutputStream("dolphin.txt"));
            oosTiger.writeObject(tiger);
            oosPenguin.writeObject(penguin);
            oosDolphin.writeObject(dolphin);
            System.out.println("Animal state saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readObjectsFromFile() {
        try {
            ObjectInputStream oisTiger = new ObjectInputStream(new FileInputStream("tiger.txt"));
            ObjectInputStream oisPenguin = new ObjectInputStream(new FileInputStream("penguin.txt"));
            ObjectInputStream oisDolphin = new ObjectInputStream(new FileInputStream("dolphin.txt"));
            Tiger tiger = (Tiger) oisTiger.readObject();
            Penguin penguin = (Penguin) oisPenguin.readObject();
            Dolphin dolphin = (Dolphin) oisDolphin.readObject();
            System.out.println("Tiger data retrieved from file: " + tiger.toString());
            System.out.println("Penguin data retrieved from file: " + penguin.toString());
            System.out.println("Dolphin data retrieved from file:  " + dolphin.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
