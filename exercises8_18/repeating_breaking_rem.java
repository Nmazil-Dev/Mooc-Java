package exercises8_18;
import java.util.Scanner;
public class repeating_breaking_rem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give numbers: ");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            if (num % 2 == 0){
                even++;
            } else {
                odd++;
            }
            sum += num;
            count++;
        }
        double average = (double)sum /count;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
