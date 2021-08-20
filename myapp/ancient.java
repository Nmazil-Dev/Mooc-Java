package myapp;
import java.util.Scanner;
public class ancient {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scanner.nextLine());
        if (year < 2015){
            System.out.print("Ancient history!");
        } else {
            System.out.print("That's current");
        }
    }
}