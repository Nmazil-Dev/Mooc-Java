package exercises8_18;

public class smallest {
    public static int smallest(int num1, int num2){
        if (num1 < num2){
            return num1;
        } else {
            return num2;
        }
    };
    public static void main(String[] args){
        System.out.println("Smalest: " + smallest(2,7));
    }    
}