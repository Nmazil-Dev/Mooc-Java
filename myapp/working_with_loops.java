package myapp;
import java.util.Scanner;
public class working_with_loops {
    //Exit message for methods
    static void exiting(){
        System.out.println("Exiting method...");
        System.out.println("=================");
    }
    // Get the sum of all numbers
    static void sumNums(Scanner scanner){
        int numSum = 0;
        while (true){
            System.out.print("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                System.out.println("Sum of the numbers: " + numSum);
                exiting();
                break;
            } else {
                numSum = numSum + num;
            }}
    }
    //Count all numbers
    static void countAll(Scanner scanner){
        int numCount = 0;
        while (true){
            System.out.print("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                System.out.println("Counted " + numCount + " numbers!");
                exiting();
                break;
            } else {
                numCount++;
            }
        }
    }
    //Count only positive numbers
    static void countPos(Scanner scanner){
        int numCount = 0;
        while (true){
            System.out.print("Give a positive number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0){
                numCount++;
            } else if (num == 0){
                System.out.println("Counted " + numCount + " positive numbers!");
                exiting();
                break;
            }
        }
    }
    // Count only negative numbers
    static void countNeg(Scanner scanner){
        int numCount = 0;
        while (true){
            System.out.print("Give a negative number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0 ){
                numCount++;
            } else if (num == 0){
                System.out.println("Counted " + numCount + " negative numbers!");
                exiting();
                break;
            }
        }
    }
    static void absoluteVal(Scanner scanner){
        while (true){
            System.out.println("Give a number to get its absolute value: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0 ){
                System.out.println(num * -1);
            } else if (num == 0){
                break;
            } else {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            //Menu for program
            System.out.println("Select a method to run!");
            System.out.println("0. Exit the method.");
            System.out.println("1. SumNums - Enter numbers and get their sum.");
            System.out.println("2. countAll - Count all numbers entered.");
            System.out.println("3. CountPos - Count all positive numbers.");
            System.out.println("4. CountNeg - Count all negative numbers.");
            System.out.println("5. absoluteVal - Get the absolute value of given int.");
            int selection = Integer.valueOf(scanner.nextLine());
            if (selection == 1){
                sumNums(scanner);
                continue;
            } else if (selection == 2){
                countAll(scanner);
                continue;
            }else if (selection == 3){
                countPos(scanner);
                continue;
            }else if (selection == 4){
                countNeg(scanner);
                continue;
            }else if (selection == 5){
                absoluteVal(scanner);
            }else {
                System.out.println("Exiting program.");
                break;
            }
        }
        //countAll(scanner, numCount, num);
    }
}