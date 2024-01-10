// Day 12: Inheritance

import java.util.*;

// Declare a class named Person
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data with method printPerson()
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

// Declare a class Student extends class Person
class Student extends Person {
    private int[] testScores;

    /**
     * Class Constructor
     * 
     * @param firstName - A string denoting the Person's first name.
     * 
     * @param lastName  - A string denoting the Person's last name.
     * 
     * @param id        - An integer denoting the Person's ID number.
     * 
     * @param scores    - An array of integers denoting the Person's test scores.
     **/
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }
    /*
     * Method Name: calculate
     * 
     * @return A character denoting the grade.
     */
    // Write your method here

    public char calculate() {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

        int pointAvg = sum / testScores.length;
        if (pointAvg >= 90) {
            return 'O';
        } else if (pointAvg >= 80) {
            return 'E';
        } else if (pointAvg >= 70) {
            return 'A';
        } else if (pointAvg >= 55) {
            return 'P';
        } else if (pointAvg >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

public class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}