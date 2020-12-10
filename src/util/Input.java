package util;

import java.util.Scanner;

public class Input {

    private Scanner scan;


    public Input(Scanner myScanner) {
        scan = new Scanner(System.in);
    }

    public String getString() {
        return scan.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Please enter yes or no.");
        String input = scan.next();
        if(input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        do {
            int input;
            System.out.printf("Please input a number between %d and %d.%n", min, max);
            input = scan.nextInt();
        }while(input < min || input > max);
    }

    public double getInt(double min, double max) {
        do {
            float input;
            System.out.printf("Please input a number between %f and %f.%n", min, max);
            input = scan.nextInt();
        }while(input < min || input > max);
    }

    public double getDouble(double min, double max) {

    }

    public double getDouble() {

    }





}
