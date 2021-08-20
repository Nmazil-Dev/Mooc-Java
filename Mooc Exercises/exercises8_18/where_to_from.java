package exercises8_18;
import java.util.Scanner;
public class where_to_from{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to: ");
        int whereTo = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from: ");
        int whereFrom = Integer.valueOf(scanner.nextLine());
        for (int i = whereFrom; i <= whereTo; i++){
            System.out.println(i);
        }
    }
}