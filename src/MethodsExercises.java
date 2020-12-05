import java.io.PrintStream;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(Addition(10, 5));
//        System.out.println(Subtraction(10, 5));
//        System.out.println(Multiplication(10, 5));
//        System.out.println(Division(10, 5));
//        System.out.println(Modulus(10, 5));
        getInteger(1, 10);
    }

    //ARITHMETIC METHODS
//    public static int Addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int Subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int Multiplication(int num1, int num2) {
//        if (num2 <= 0) {
//            return 0;
//        }
//        return num1 + Multiplication(num1, num2 - 1);
//    }
//
//    public static int Division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int Modulus(int num1, int num2) {
//        return num1 % num2;
//    }
    //INPUT RANGE VALIDATION
    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10:\n ");
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        do {
            getInteger(1, 10);
            continue;
        } while(userNumber < min | userNumber > max);
        System.out.println(userNumber);
        return userNumber;
    }










}
