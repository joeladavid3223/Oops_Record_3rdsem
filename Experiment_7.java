package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

//Custom checked exception for invalid name
class NameException extends Exception {
 public NameException(String message) {
     super(message);
 }
}

//Custom checked exception for invalid age
class AgeException extends Exception {
 public AgeException(String message) {
     super(message);
 }
}

//Employee class
class Employee {
 String name;
 int age;

 public Employee(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void display() {
     System.out.println("\nEmployee Details:");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Main class
public class Experiment_7 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Employee Name: ");
         String name = sc.nextLine();

         // Check if the name is numeric
         if (name.matches("\\d+")) {
             throw new NameException("Invalid Name! Name cannot be a number.");
         }

         System.out.print("Enter Employee Age: ");
         int age = sc.nextInt();

         // Check if the age is greater than 50
         if (age > 50) {
             throw new AgeException("Invalid Age! Age cannot be greater than 50.");
         }

         // If valid, create Employee object
         Employee emp = new Employee(name, age);
         emp.display();

     } catch (NameException | AgeException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     sc.close();
 }
}

