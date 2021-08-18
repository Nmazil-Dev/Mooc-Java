package myapp;
import java.util.Scanner;
public class leap_year {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Give a year: ");
       int year = Integer.valueOf(scanner.nextLine());
       if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
           System.out.print("The year is a leap year.");
       } else {
           System.out.print("The year is not a leap year.");
       }

   } 
}