package myapp;
import java.util.Scanner;
public class average3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the third number: ");
        int thirdNum = Integer.valueOf(scanner.nextLine());
        double average = (double) (firstNum + secondNum + thirdNum) /3;
        System.out.println("The average is: " + average);

    }
    
}