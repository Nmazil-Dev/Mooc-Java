package exercises8_18;

public class star_sign {
    public static void printStars(int num){
        for (int i = 0; i < num; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printSquare(int size){
        for (int i = 0; i < size; i++){
            printStars(size);
        }
    }
    public static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++){
            printStars(width);
        }
    }
    public static void printTriangle(int size){
        for (int i = 0; i <= size; i++){
            printStars(i);
        }
    }
    public static void main(String[] args){
        printTriangle(4);
    }
}