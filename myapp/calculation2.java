package myapp;
import java.util.Scanner;
public class calculation2 {
    public static void main(String[] args){
        //Get scanner from java.util.Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first number: ");
        int firstInt = Integer.valueOf(scanner.nextLine());
        System.out.print("What is your second number: ");
        int secondInt = Integer.valueOf(scanner.nextLine());
        int sumVal = firstInt + secondInt;
        System.out.println(firstInt + " + " + secondInt + " = " + sumVal);
    }
}