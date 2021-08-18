package myapp;
import java.util.Scanner;
public class simple_calc {
    public static void main(String[] args){
        //Initialize Scanner and get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("What is the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        //String for sum
        int sum = firstNum + secondNum;
        String addition = firstNum + " + " + secondNum + " = " + sum;
        System.out.println(addition);
        //String for difference
        int difference = firstNum - secondNum;
        String subtraction = firstNum + " - " + secondNum + " = " + difference;
        System.out.println(subtraction);
        //String for product
        int product = firstNum * secondNum;
        String multiplication = firstNum + " * " + secondNum + " = " + product;
        System.out.println(multiplication);
        //String for quotient
        double quotient = (double) firstNum / secondNum;
        String division = firstNum + " / " + secondNum + " = " + quotient;
        System.out.println(division);
    }
}