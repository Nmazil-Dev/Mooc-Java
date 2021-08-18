package myapp;
import java.util.Scanner;
public class larger_equal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Give the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        String greater = "The greater number is: ";
        if (firstNum == secondNum){
            System.out.print("The numbers are equal.");
        } else if (firstNum > secondNum){
            System.out.print(greater + firstNum);
        } else {
            System.out.print(greater + secondNum);
        }
    }
}