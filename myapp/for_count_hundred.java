package myapp;
import java.util.Scanner;
public class for_count_hundred {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number and count to 100: ");
        int num = Integer.valueOf(scanner.nextLine());
        if (num >= 100){
            System.out.println("Too big, try again.");
        } else{
            for (int i = num; i <= 100; i++){
                System.out.println(i);
            }
        }
    }
}