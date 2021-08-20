package myapp;
import java.util.Scanner;
public class comparing_numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        if (firstNum == secondNum){
            System.out.print(firstNum + " is equal to " + secondNum + ".");
        } else if (firstNum > secondNum){
            System.out.print(firstNum + " is greater than " + secondNum + ".");
        } else {
            System.out.print(firstNum + " is smaller than " + secondNum + ".");
        }
    }
}