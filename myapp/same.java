package myapp;
import java.util.Scanner;
public class same {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the next string: ");
        String second = scanner.nextLine();
        if (first.equals(second)){
            System.out.print("Same");
        } else {
            System.out.print("Different");
        }
    }
}