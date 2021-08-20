package myapp;
import java.util.Scanner;

public class seconds_in_day{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert into seconds?");
        String userInput = scanner.nextLine();
        int seconds = (24 * Integer.valueOf(userInput)) * 3600;
        //int seconds = minutes * 60;
        System.out.println(seconds);

    }
}