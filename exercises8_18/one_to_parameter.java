package exercises8_18;
import java.util.Scanner;
public class one_to_parameter {
    public static void printUntil(int stop){
        for (int i = 1; i <= stop; i++){
            System.out.println(i);
        };
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int stop = Integer.valueOf(scanner.nextLine());
        printUntil(stop);
    }
}
