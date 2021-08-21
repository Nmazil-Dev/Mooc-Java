package exercises8_18;
import java.util.Scanner;
public class division {
    public static void division(int numerator, int denominator){
        System.out.println((double) numerator / denominator);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter denominator: ");
        int denominator = Integer.valueOf(scanner.nextLine());
        division(numerator, denominator);
    }
}
