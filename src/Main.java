import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        int a = numbers[0];
//        int b = numbers[1];
//        int[] rest = Arrays.copyOfRange(numbers, 2, numbers.length);
//
//        System.out.println("a: " + a); // 1
//        System.out.println("b: " + b); // 2
//        System.out.println("rest: " + Arrays.toString(rest)); // [3, 4, 5]



        printNumbers(1, 2, 3, 4, 5 ,6,7,8,9,10);
    }
    public static void printNumbers(int a, int b, int... rest) {
        System.out.println("a: " + a); // 1
        System.out.println("b: " + b); // 2
        System.out.println("rest: " + Arrays.toString(rest)); // [3, 4, 5]
    }
}