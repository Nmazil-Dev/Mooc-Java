package exercises8_18;
import java.util.Scanner;
public class reprint_refactor {
    public static void printing(int numTimes){
        for (int i = 0; i < numTimes; i++){
            System.out.println("In a hole in the ground there was a method.");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times: ");
        int numTimes = Integer.valueOf(scanner.nextLine());
        printing(numTimes);
    }
}
