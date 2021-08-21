package exercises8_18;
import java.util.Scanner;
public class divisible_by_3 {
    public static void divisCheck(int start, int stop){
        for (int i = start; i <= stop; i++){
            if (i % 3 == 0){
                System.out.println(i);
            };
        };
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter an ending number: ");
        int stop  = Integer.valueOf(scanner.nextLine());
        divisCheck(start, stop);
    }
}
