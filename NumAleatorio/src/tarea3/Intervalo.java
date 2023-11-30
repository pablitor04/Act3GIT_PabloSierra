package tarea3;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Get the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int thirdNumber = scanner.nextInt();
        
        // Close the scanner to prevent resource leak
        scanner.close();

        // Ensure the first number is less than the second number
        if (firstNumber > secondNumber) {
            System.out.println("Invalid input. The first number should be less than the second number.");
        } else {
            // Display the numbers between the two input numbers
            System.out.println("Numbers between " + firstNumber + " and " + secondNumber + ":");
            for (int i = firstNumber; i < secondNumber; i++) {
                System.out.println(i);
                i = i +6;
            }
        }
        if (thirdNumber <= secondNumber && thirdNumber >= firstNumber) {
        	
        	System.out.println(thirdNumber);
        	
        }
    }
}
