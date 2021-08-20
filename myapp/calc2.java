package myapp;
//Imports Scanner
import java.util.Scanner;
//Tells JVM what to open
// Get user input and multiply two numbers together
public class calc2{
    public static void main(String[] args){
        //Make an instance of Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Give the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int product = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + product);
    }
}