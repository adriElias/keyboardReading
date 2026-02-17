# Safe Keyboard Input

Educational project to learn how to safely read user input from the console.

## Objectives

- Learn to capture and handle exceptions when reading data from the keyboard.
- Prevent the application from crashing due to invalid user input.
- Practice with standard exceptions (`InputMismatchException`) and custom ones.
- Consolidate the use of static methods to promote code reuse.

## Statement

Create a utility class called `ConsoleReader` that allows safe reading of different data types from the keyboard.  
This class must handle errors that occur when the user enters incorrect values (e.g., text instead of numbers).

Use a single `Scanner` object and define a series of **static methods** to read data.  
Each method should:
- Display a custom message
- Read the value
- Validate it
- Show an error message (e.g. “Invalid format”) and retry until valid input is received

## Requirements

- All methods receive a `String` parameter with the prompt message.
- They handle errors and only return the value when it is valid.
- The prompt message is re-displayed every time there is an error.

## Methods to implement

With `InputMismatchException` handling:

```java
public static byte   readByte(String message);
public static int    readInt(String message);
public static float  readFloat(String message);
public static double readDouble(String message);
```

### With a custom exception:

```java
public static char   readChar(String message);
// Accepts only one character. If more than one is entered, throws a custom exception.

public static String readString(String message);
// Reads the string as entered (optional: add minimum length or content validation).

public static boolean readYesNo(String message);
// Returns true if the user enters "s" (lowercase), false if "n".
// Any other input should throw a custom exception.
```

### Expected usage example

```text
Enter your age: hello
Invalid format. Try again.
Enter your age: 25
```

### Project structure

```text
textsrc/
├── ConsoleReader.java
├── InvalidInputException.java   # Custom exception
└── Main.java                    # Demo / test class
```

### Concepts demonstrated

* Handling InputMismatchException with while(true) retry loops
* Creating and throwing a custom exception (InvalidInputException)
* Automatic retry with repeated prompt
* Single static Scanner for all reads
* Static methods for easy reuse across projects


### How to run

```Bash
javac src/*.java
java -cp src Main
```