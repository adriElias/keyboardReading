package org.keyboardReading;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("\n --- Questions to get to know you better --- \n");
            String name = ConsoleReader.readString("What is your name?: ");
            int age = ConsoleReader.readInt("How old are you?: ");
            boolean isProgrammer = ConsoleReader.readYesNo("Are you a programmer? Yes:y or No:n: ");
            char shift = ConsoleReader.readChar("What are your work or study shifts? Morning:m|Afternoon:a|Night:n: ");
            double salary = ConsoleReader.readDouble("How much salary do you receive?: ");
            float height = ConsoleReader.readFloat("How tall are you?: ");


            System.out.println("\n --- ABOUT YOU --- \n");
            System.out.println("Your name is: " + name);
            System.out.println("Your age is: " + age + " years old");
            System.out.println("You are a programmer:  " + isProgrammer);
            System.out.println("You work or study in the m:Morning|a:Afternoon|n:Night: " + shift);
            System.out.println("Your salary is: " + salary + "€");
            System.out.println("You are " + height + " tall");

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
