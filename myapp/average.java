package myapp;
import java.util.Scanner;
public class average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        double average = (double) (firstNum + secondNum)/2;
        System.out.println("The average of " + firstNum + " and " + secondNum + " is " + average);
    }
    
}