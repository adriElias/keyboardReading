package org.keyboardReading;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error, byte type was expected. Please try again.");
                scanner.nextLine(); //deletes the line break
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error, int type was expected. Please try again.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error, float type was expected. Please try again.");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error, double type was expected. Please try again.");
                scanner.nextLine();
            }
        }
    }
}
