/**
 * MidtermStudyGuide.java
 *
 * THE JAVA READINESS GAUNTLET: MIDTERM PREPARATION
 *
 * This file is a comprehensive, gamified study application for the CS 122 Midterm Exam.
 * Your mission is to prove your readiness by completing programming tasks and then
 * conquering the interactive challenges you've enabled.
 *
 * ======================================================================================
 * HOW TO USE THIS STUDY GUIDE:
 *
 * PART 1: THE DEVELOPER (PROGRAMMING PRACTICE)
 * - Your first task is to read through this file and complete the code in every `// TODO:` section.
 * - You are building the logic for the gauntlet's challenges. This part tests your
 * practical coding skills, syntax knowledge, and understanding of program flow.
 *
 * PART 2: THE RECRUIT (CONCEPTUAL REVIEW)
 * - Once all `// TODO:` sections are complete, compile and run the file.
 * - You will enter the gauntlet as a recruit. Your goal is to earn XP by correctly
 * answering questions in each training module.
 * - This part tests your conceptual understanding and readiness for the exam.
 *
 * By completing both parts, you should be a little more prepared for the midterm.
 *
 * Good luck, recruit!
 * - Prof. Sarah L.
 * ======================================================================================
 */

// LECTURE 9: PACKAGES
// The 'import' statement brings in code from other packages.
// `Scanner` is in `java.util`, and we need it for user input.
import java.util.Scanner;

// LECTURE 1: CLASSES
// Every Java program is contained within a class. This is our main application class.
public class MidtermStudyGuide {

    // LECTURE 1: THE 'main' METHOD
    // This is the special method where program execution begins.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalXP = 0;
        final int MAX_XP = 12; // There are 12 challenges to earn XP from.
        boolean isGauntletActive = true;

        System.out.println("==============================================");
        System.out.println("      JAVA READINESS GAUNTLET: ACTIVATED      ");
        System.out.println("==============================================");
        System.out.println("Prove your midterm readiness, recruit!");

        // LECTURE 5: THE 'while' LOOP
        // This loop keeps the main menu running until the user chooses to exit.
        while (isGauntletActive) {
            printMenu();
            System.out.print("Select your training module (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer.

            // LECTURE 5: THE 'switch' STATEMENT
            // This directs the program to the correct module based on user input.
            switch (choice) {
                case 1:
                    totalXP += runBootcampBasics(scanner);
                    break;
                case 2:
                    totalXP += runOperatorObstacleCourse(scanner);
                    break;
                case 3:
                    totalXP += runLogicAndRepetitionDrills(scanner);
                    break;
                case 4:
                    totalXP += runObjectOrientedSimulation(scanner);
                    break;
                case 5:
                    isGauntletActive = false;
                    break;
                default: // The 'default' case handles any input that doesn't match a case.
                    System.out.println("! Invalid module code. Please select a valid option.");
            }
        }

        System.out.println("\n--- GAUNTLET COMPLETE ---");
        System.out.println("Final Readiness Score: " + totalXP + " / " + MAX_XP + " XP");
        if (totalXP >= 10) {
            System.out.println("STATUS: Mission Ready! You are well-prepared for the midterm.");
        } else if (totalXP >= 6) {
            System.out.println("STATUS: Field Agent. Solid performance, but review weaker areas.");
        } else {
            System.out.println("STATUS: Recruit. Further study is strongly recommended.");
        }
        scanner.close();
    }

    // LECTURE 7: METHODS
    // A static void method to print the main menu.
    public static void printMenu() {
        System.out.println("\n========= TRAINING MODULES =========");
        System.out.println("1. Module 1: Bootcamp Basics (Vars, Types, I/O)");
        System.out.println("2. Module 2: Operator Obstacle Course (Math, Strings)");
        System.out.println("3. Module 3: Logic & Repetition Drills (Control Flow, Arrays)");
        System.out.println("4. Module 4: Object-Oriented Simulation (All OOP Concepts)");
        System.out.println("5. Exit Gauntlet");
        System.out.println("====================================");
    }

    // Module 1: Covers Lectures 1-2 on Java basics, variables, and input.
    public static int runBootcampBasics(Scanner scanner) {
        System.out.println("\n--- Module 1: Bootcamp Basics ---");
        int xp = 0;

        System.out.println("Q1: Which of Java's 8 primitive types would you use to store the value `true` or `false`?");
        System.out.print(">> ");
        String answer1 = scanner.nextLine();
        // TODO (Programmer): Check if the user's answer is "boolean".
        if (answer1.equalsIgnoreCase("your_answer_here")) {
            System.out.println("...Access Granted. `boolean` is correct. [+1 XP]");
            xp++;
        } else {
            System.out.println("...Access Denied. The correct type is `boolean`.");
        }

        System.out.println("\nQ2: What is the proper term for an error caught by the compiler BEFORE the program runs (e.g., a syntax error)?");
        System.out.println("1. Run-time error  2. Compile-time error  3. Logical error");
        System.out.print(">> ");
        int answer2 = scanner.nextInt();
        scanner.nextLine();
        // TODO (Programmer): Check if the user entered 2.
        if (answer2 == 0) { // Replace 0 with the correct number
            System.out.println("...Access Granted. Compile-time errors prevent the code from even compiling. [+1 XP]");
            xp++;
        } else {
            System.out.println("...Access Denied. A syntax error is a compile-time error.");
        }
        return xp;
    }

    // Module 2: Covers Lecture 3 on operators, formatting, and Strings.
    public static int runOperatorObstacleCourse(Scanner scanner) {
        System.out.println("\n--- Module 2: Operator Obstacle Course ---");
        int xp = 0;

        System.out.println("Q1: What is the result of the modulo operator in `10 % 3`?");
        System.out.print(">> ");
        int answer1 = scanner.nextInt();
        scanner.nextLine();
        // TODO (Programmer): 10 divided by 3 is 3 with a remainder of 1.
        if (answer1 == 0) { // Replace 0 with the correct number
            System.out.println("...Signal Clear. The remainder is 1. [+1 XP]");
            xp++;
        } else {
            System.out.println("...Signal Corrupted. The result of `10 % 3` is 1.");
        }

        String code = "Midterm";
        System.out.println("\nQ2: Given `String code = \"Midterm\";`, what is the output of `code.length()`?");
        System.out.print(">> ");
        int answer2 = scanner.nextInt();
        scanner.nextLine();
        // TODO (Programmer): The String "Midterm" has 7 characters.
        if (answer2 == 0) { // Replace 0 with the correct number
            System.out.println("...Signal Clear. The `.length()` method returns the number of characters. [+1 XP]");
            xp++;
        } else {
            System.out.println("...Signal Corrupted. The length is 7.");
        }

        System.out.println("\nQ3: If you need to explicitly convert a `double` to an `int`, what is this action called?");
        System.out.print(">> ");
        String answer3 = scanner.nextLine();
        // TODO (Programmer): Check if the user's answer contains the word "casting".
        if (answer3.toLowerCase().contains("your_string_here")) {
            System.out.println("...Signal Clear. This is known as explicit type casting. [+1 XP]");
            xp++;
        } else {
            System.out.println("...Signal Corrupted. The term is type casting (e.g., `(int) myDouble;`).");
        }
        return xp;
    }

    // Module 3: Covers Lectures 4-5 on control flow and arrays.
    public static int runLogicAndRepetitionDrills(Scanner scanner) {
        System.out.println("\n--- Module 3: Logic & Repetition Drills ---");
        int xp = 0;

        System.out.println("Q1: Which logical operator means 'AND' and requires both conditions to be true?");
        System.out.print(">> ");
        String answer1 = scanner.nextLine();
        // TODO (Programmer): The AND operator is `&&`.
        if (answer1.equals("your_string_here")) {
            System.out.println("...Sequence Validated. `&&` is the logical AND operator. [+1 XP]");
            xp++;
        } else {
            System.out.println("...Sequence Invalid. The correct operator is `&&`.");
        }

        System.out.println("\nQ2: For an array `String[] agents = {\"A\", \"B\", \"C\"};`, what is the value of `agents[0]`?");
        System.out.print(">> ");
        String answer2 = scanner.nextLine();
        // TODO (Programmer): Arrays are 0-indexed. The element at index 0 is "A".
        if (answer2.equalsIgnoreCase("your_string_here")) {
            System.out.println("...Sequence Validated. Arrays are 0-indexed. [+1 XP]");
            xp++;
        } else {
            System.out.println("...Sequence Invalid. The value at index 0 is \"A\".");
        }
        return xp;
    }

    // Module 4: Covers Lectures 6-9 on all OOP concepts.
    public static int runObjectOrientedSimulation(Scanner scanner) {
        System.out.println("\n--- Module 4: Object-Oriented Simulation ---");
        System.out.println("This module will run a simulation using the Agent classes you completed.");
        System.out.println("If your class definitions have errors, the program may crash here. That's a sign to debug your classes!");
        System.out.print("Press Enter to initiate simulation...");
        scanner.nextLine();
        int xp = 0;

        // If the student's code in the class definitions is incorrect, the program will
        // likely stop here with a compile error or a runtime error. This is expected behavior.
        System.out.println("\n[SIM] Instantiating agents...");
        RookieAgent rookie = new RookieAgent("J. Bond", "R-007", 1);
        VeteranAgent veteran = new VeteranAgent("E. Hunt", "V-001", 5);
        System.out.println("...[OK] Agents instantiated.");

        System.out.println("[SIM] Assembling agent team...");
        Agent[] team = {rookie, veteran};
        System.out.println("...[OK] Polymorphic array created.");

        System.out.println("[SIM] Verifying clearance levels...");
        for (Agent agent : team) {
            System.out.println(" > Agent " + agent.getName() + " -> " + agent.getClearanceLevel());
        }
        System.out.println("...[OK] Abstract methods overridden and executed.");

        System.out.println("[SIM] Logging mission data...");
        rookie.logMission("Infiltrated CS122 midterm study session.");
        System.out.println("...[OK] Interface method executed.");

        // If the code reaches this point, the simulation was successful.
        System.out.println("\n[SUCCESS] Simulation complete. Your class definitions are correct. [+3 XP]");
        xp += 3;

        System.out.println("\nQ1: Bundling data (fields) and methods together in a class, often with private fields and public getters/setters, is called...?");
        System.out.print(">> ");
        String answer1 = scanner.nextLine();
        // TODO (Programmer): Check if the user's answer contains "encapsulation".
        if (answer1.toLowerCase().contains("your_string_here")) {
            System.out.println("...Intel Confirmed. That's encapsulation! [+1 XP]");
            xp++;
        } else {
            System.out.println("...Intel Unconfirmed. The term is Encapsulation.");
        }

        System.out.println("\nQ2: A class that cannot be instantiated and is used as a template for other classes is known as an ________ class.");
        System.out.print(">> ");
        String answer2 = scanner.nextLine();
        // TODO (Programmer): Check if the user's answer is "abstract".
        if (answer2.equalsIgnoreCase("your_string_here")) {
            System.out.println("...Intel Confirmed. That's an abstract class! [+1 XP]");
            xp++;
        } else {
            System.out.println("...Intel Unconfirmed. The term is abstract.");
        }
        return xp;
    }
}

// ======================================================================================
// GAUNTLET BLUEPRINTS: AGENT CLASSES (Lectures 6-9)
// Complete these classes to make Module 4 function correctly.
// ======================================================================================

abstract class Agent {
    protected String name;
    protected String agentId;

    public Agent(String name, String agentId) {
        // TODO (Programmer): Initialize the `name` and `agentId` fields using `this`.
        
    }

    public String getName() {
        return this.name;
    }
    
    // An abstract method has no body. Subclasses must provide one.
    public abstract String getClearanceLevel();
}

interface MissionLog {
    // TODO (Programmer): Declare a method `logMission` that takes a String `missionDetails` and returns void.

}

class RookieAgent extends Agent implements MissionLog {
    private int missionsCompleted;

    public RookieAgent(String name, String agentId, int missionsCompleted) {
        // `super()` calls the constructor of the parent class (Agent). It must be the first line.
        // TODO (Programmer): Call the parent constructor, passing `name` and `agentId`.
        
        this.missionsCompleted = missionsCompleted;
    }

    // TODO (Programmer): Provide the implementation for the `getClearanceLevel` abstract method.
    // It should return the string "Clearance Level: Basic". Don't forget the @Override annotation.
    

    // TODO (Programmer): Provide the implementation for the `logMission` interface method.
    // It should print a message like "Rookie [Agent's Name] logged: [missionDetails]". Don't forget the @Override annotation.
    
}

class VeteranAgent extends Agent {
    private int yearsOfService;

    public VeteranAgent(String name, String agentId, int yearsOfService) {
        // TODO (Programmer): Call the parent constructor with `name` and `agentId`.
        
        this.yearsOfService = yearsOfService;
    }

    // TODO (Programmer): Override the `getClearanceLevel` method.
    // It should return the string "Clearance Level: Top Secret".
    
}