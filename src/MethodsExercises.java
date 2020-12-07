import java.io.PrintStream;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(Addition(10, 5));
//        System.out.println(Subtraction(10, 5));
//        System.out.println(Multiplication(10, 5));
//        System.out.println(Division(10, 5));
//        System.out.println(Modulus(10, 5));
//        getInteger(1, 10);
        System.out.println("This is the result of Calculate Factorial: " + calculateFactorial());
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
    //INPUT RANGE VALIDATION USING ITERATION
//    public static int getInteger(int min, int max) {
//        Scanner scan = new Scanner(System.in);
//        int userNumber;
//
//        do{
//        System.out.println("Enter a number between 1 and 10: ");
//        userNumber = scan.nextInt();
//        }while(userNumber < min || userNumber > max);
//
//        System.out.println(userNumber);
//        return userNumber;
//    }

    //INPUT RANGE VALIDATION USING RECURSION
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d:\n", min, max);
        int userNumber;
        userNumber = scan.nextInt();

        if(userNumber < min || userNumber > max) {
            return getInteger(min, max);
        }
        System.out.println(userNumber);
        return userNumber;

    }


    //CALCULATE THE FACTORIAL OF A NUMBER
    public static int calculateFactorial() {

        System.out.println("Enter a number between 1 and 10:");
        int userNumber = getInteger(1, 10);
        int fact = 1;

        for (int i = 1; i <= userNumber; i++) {
            fact = fact * i;
            System.out.printf("%d! = %d\n", i, fact);
        }
        return fact;
    }









}
