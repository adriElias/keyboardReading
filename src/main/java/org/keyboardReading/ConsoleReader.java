package org.keyboardReading;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.print(message);
            try {
                byte value = scanner.nextByte();
                scanner.nextLine(); // cleans buffer after successful read
                return value;
            } catch (InputMismatchException e) {
                scanner.nextLine(); //cleans buffer after error
                System.out.println("Format error, byte type was expected. Please try again.");
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                int value = scanner.nextInt();
                scanner.nextLine(); // cleans buffer after successful read
                return value;
            } catch (InputMismatchException e) {
                scanner.nextLine(); //cleans buffer after error
                System.out.println("Format error, int type was expected. Please try again.");
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.print(message);
            try {
                float value = scanner.nextFloat();
                scanner.nextLine(); // cleans buffer after successful read
                return value;
            } catch (InputMismatchException e) {
                scanner.nextLine(); //cleans buffer after error
                System.out.println("Format error, float type was expected. Please try again.");
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                double value = scanner.nextDouble();
                scanner.nextLine(); // cleans buffer after successful read
                return value;
            } catch (InputMismatchException e) {
                scanner.nextLine(); //cleans buffer after error
                System.out.println("Format error, double type was expected. Please try again.");
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.print(message);
            try {
                String input = scanner.nextLine().trim().toLowerCase();
                if (input.length() != 1) {
                    throw new InvalidInputException("You must enter exactly ONE character.");
                }
                if (!input.equals("m") && !input.equals("a") && !input.equals("n")) {
                    throw new InvalidInputException("Only 'm':Morning|'a':Afternoon|'n':Night is allowed.");
                }
                return input.charAt(0);
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage() + " Please try again.");
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.print(message);
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new InvalidInputException("Input cannot be empty.");
                }
                return input;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage() + " Please try again.");
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.print(message);
            try {
                String input = scanner.nextLine().trim().toLowerCase();
                if (input.equals("y")) {
                    return true;
                }
                if (input.equals("n")) {
                    return false;
                }
                throw new InvalidInputException("Only 'y'='Yes' or 'n'='No' is allowed.");
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage() + " Please try again.");
            }
        }

    }

}
