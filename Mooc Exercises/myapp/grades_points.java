package myapp;
import java.util.Scanner;
public class grades_points {
 public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Give points [0-100]: ");
     int points = Integer.valueOf(scanner.nextLine());
     String grade = "Grade: ";
     if (points < 0){
         System.out.print(grade + "Impossible!");
     } else if (points <= 49){
         System.out.print(grade + "Failed.");
     } else if (points <= 59){
         System.out.print(grade + "1");
     } else if (points <= 69){
         System.out.print(grade + "2");
     } else if (points <= 79){
         System.out.print(grade + "3");
     } else if (points <= 89){
         System.out.print(grade + "4");
     } else if (points < 100){
         System.out.print(grade + "5");
     } else {
         System.out.print(grade + "Incredible!");
     }
 }   
}