package myapp;
import java.util.Scanner;
public class square_root_sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(firstNum + secondNum);
        System.out.print("The square root of the sum of your two numbers is: " + squareRoot);
    }
}