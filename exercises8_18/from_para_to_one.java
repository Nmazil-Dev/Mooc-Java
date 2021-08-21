package exercises8_18;
import java.util.Scanner;
public class from_para_to_one {
    public static void countDown(int stop){
        for(int i = stop -1 ; i > 0; i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int stop = Integer.valueOf(scanner.nextLine());
        countDown(stop);
    }
}
